/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geoimage.viewer.widget.panels;

import java.awt.Color;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.geoimage.analysis.VDSSchema;
import org.geoimage.def.SarImageReader;
import org.geoimage.opengl.OpenGLContext;
import org.geoimage.viewer.core.GeometryImage;
import org.geoimage.viewer.core.SumoPlatform;
import org.geoimage.viewer.core.api.IComplexVectorLayer;
import org.geoimage.viewer.core.api.ilayer.ILayer;
import org.geoimage.viewer.core.gui.manager.LayerManager;
import org.geoimage.viewer.core.layers.image.ImageLayer;
import org.geoimage.viewer.core.layers.visualization.AttributesGeometry;
import org.geoimage.viewer.core.layers.visualization.vectors.EditGeometryVectorLayer;
import org.geoimage.viewer.widget.AttributesEditor;
import org.jrc.sumo.configuration.PlatformConfiguration;
import org.jrc.sumo.util.Constant;
import org.slf4j.LoggerFactory;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;

/**
 *
 * @author leforth
 */
public class GeometricInteractiveVDSLayerModel extends DefaultTableModel {

    private GeometryImage gl;
    private ImageLayer il;
    private IComplexVectorLayer vdslayer;
    
    private Color azimuthGeometrycolor = null;
    private int azimuthGeometrylinewidth;

    private static org.slf4j.Logger logger=LoggerFactory.getLogger(GeometricInteractiveVDSLayerModel.class);
    
    public GeometricInteractiveVDSLayerModel(ILayer layer) {
        this.gl = ((EditGeometryVectorLayer) layer).getGeometriclayer();
        this.il = null;

        for (ILayer l : LayerManager.getIstanceManager().getLayers().keySet()) {
            if (l instanceof ImageLayer && l.isActive()) {
                il = (ImageLayer) l;
                break;
            }
        }

        vdslayer = (IComplexVectorLayer) layer;

        PlatformConfiguration configuration = SumoPlatform.getApplication().getConfiguration();
        // set the preferences values
        try {
            String colorString = configuration.getAzimuthGeometryColor();
            this.azimuthGeometrycolor = new Color(Integer.parseInt(colorString.equals("") ? Color.ORANGE.getRGB() + "" : colorString));
            this.azimuthGeometrylinewidth = configuration.getAzimuthLineWidth();
        } catch (NumberFormatException e) {
            //Logger.getLogger(GeometricInteractiveVDSLayerModel.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Wrong format with the preference settings", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getRowCount() {
    	if(gl==null)
    		return 0;
        return gl.getGeometries().size();
    }

    public int getColumnCount() {
    	if(gl==null)
    		return 0;
        return gl.getSchema().length + 1;
    }

    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Geometry";
        } else {
            return gl.getSchema()[columnIndex - 1];
        }
    }

    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 0) {
            return Geometry.class;
        } else {
        	try{
	        	String attr = gl.getSchema()[columnIndex - 1];
	        	AttributesGeometry attrGeom=(AttributesGeometry) gl.getGeometries().get(0).getUserData();
	        	Object o=attrGeom.get(attr);
	        	if(o==null)
	        		return String.class;
	        	
	        	if(o instanceof double[])
	        		return double[].class;
	        	
	        	return attrGeom.get(attr).getClass();	
        	}catch(Exception e){
        		return String.class;
        	}	
        }
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex > 7) {
            return true;
        }
        return false;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Geometry geom = gl.getGeometries().get(rowIndex);
        if (columnIndex == 0) {
            return geom;
        } else {
        	try{
        		Object o=gl.getAttributes(geom).get(gl.getSchema()[columnIndex - 1]);
        		return o;
        	}catch(Exception e){
        		return null;
        	}
        }
    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Geometry geom = gl.getGeometries().get(rowIndex);
        gl.getAttributes(geom).set(gl.getSchema()[columnIndex - 1], aValue);
        SumoPlatform.getApplication().getGeoContext().setDirty(true);
    }

    /**
     *  specific VDS rendering
     * @param selectionLine
     * @param display
     */
    public void changeSelection(int selectionLine, boolean display) {
    	OpenGLContext geoContext=SumoPlatform.getApplication().getGeoContext();
        if (selectionLine != -1&&gl.getGeometries().size()>0) {
            Geometry geom = gl.getGeometries().get(selectionLine);
            int posX = (int) geom.getCoordinate().x;
            int posY = (int) geom.getCoordinate().y;
            geoContext.setX((int) (posX - geoContext.getWidth() / 2));
            geoContext.setY((int) (posY - geoContext.getHeight() / 2));
            geoContext.setZoom((float) 1.0);
            GeometryFactory gf = new GeometryFactory();
            // generate the geometry for the target shape
            List<Geometry> winGeom = new ArrayList<Geometry>();
            int size = 100;
            Coordinate[] coordinates = new Coordinate[5];
            coordinates[0] = new Coordinate(posX - size / 2, posY - size / 2);
            coordinates[1] = new Coordinate(posX + size / 2, posY - size / 2);
            coordinates[2] = new Coordinate(posX + size / 2, posY + size / 2);
            coordinates[3] = new Coordinate(posX - size / 2, posY + size / 2);
            coordinates[4] = new Coordinate(posX - size / 2, posY - size / 2);
            winGeom.add(gf.createLinearRing(coordinates));
            // generate the geometry for the boat shape
            List<Geometry> boatGeom = new ArrayList<Geometry>();
            AttributesGeometry boatattributes = gl.getAttributes(geom);
            double[] pixelsize = il.getImageReader().getPixelsize();
            double boatwidth =0;
            double boatlength=0;
            double boatheading =0;
            if(boatattributes!=null){
	            if(boatattributes.get(VDSSchema.ESTIMATED_WIDTH)!=null)
	            	boatwidth = (Double) boatattributes.get(VDSSchema.ESTIMATED_WIDTH) / pixelsize[0];
	            if(boatattributes.get(VDSSchema.ESTIMATED_WIDTH)!=null)
	                boatlength = (Double) boatattributes.get(VDSSchema.ESTIMATED_LENGTH) / pixelsize[0];
	            if(boatattributes.get(VDSSchema.ESTIMATED_HEADING)!=null)
	            	boatheading = -(Double) boatattributes.get(VDSSchema.ESTIMATED_HEADING);
		           
		        //get the image azimuth
		        double imageAz = ((SarImageReader)il.getImageReader()).getImageAzimuth();
		        boatheading = boatheading + 90 + imageAz;
		        Coordinate[] boatcoordinates = new Coordinate[5];
		        boatcoordinates[0] = new Coordinate(posX + boatlength / 2 * Math.cos(Math.PI * boatheading / 180.0) + boatwidth / 2 * Math.sin(Math.PI * boatheading / 180.0), posY - boatlength / 2 * Math.sin(Math.PI * boatheading / 180.0) + boatwidth / 2 * Math.cos(Math.PI * boatheading / 180.0));
		        boatcoordinates[1] = new Coordinate(posX - boatlength / 2 * Math.cos(Math.PI * boatheading / 180.0) + boatwidth / 2 * Math.sin(Math.PI * boatheading / 180.0), posY + boatlength / 2 * Math.sin(Math.PI * boatheading / 180.0) + boatwidth / 2 * Math.cos(Math.PI * boatheading / 180.0));
		        boatcoordinates[2] = new Coordinate(posX - boatlength / 2 * Math.cos(Math.PI * boatheading / 180.0) - boatwidth / 2 * Math.sin(Math.PI * boatheading / 180.0), posY + boatlength / 2 * Math.sin(Math.PI * boatheading / 180.0) - boatwidth / 2 * Math.cos(Math.PI * boatheading / 180.0));
		        boatcoordinates[3] = new Coordinate(posX + boatlength / 2 * Math.cos(Math.PI * boatheading / 180.0) - boatwidth / 2 * Math.sin(Math.PI * boatheading / 180.0), posY - boatlength / 2 * Math.sin(Math.PI * boatheading / 180.0) - boatwidth / 2 * Math.cos(Math.PI * boatheading / 180.0));
		        boatcoordinates[4] = boatcoordinates[0];
		        boatGeom.add(gf.createLinearRing(boatcoordinates));
		        // remove previous geometries
		        vdslayer.removeGeometriesByTag("boatshape");
		        vdslayer.removeGeometriesByTag("target");
		        // add new geometries
		        vdslayer.addGeometries("target", new Color(0xFF2200), 1, GeometryImage.LINESTRING, winGeom, display);
		        vdslayer.addGeometries("boatshape", new Color(0xFF2200), 2, GeometryImage.LINESTRING, boatGeom, display);
            }    
            geoContext.setDirty(true);
            System.out.println(selectionLine + " " + geom.getCoordinate().x + " " + geom.getCoordinate().y);
        } else {
            vdslayer.removeGeometriesByTag("boatshape");
            vdslayer.removeGeometriesByTag("target");
            geoContext.setDirty(true);
        }
    }

    public void editSelection(int selectionLine) {
        AttributesGeometry atts = gl.getAttributes(gl.getGeometries().get(selectionLine));
        AttributesEditor ae = new AttributesEditor(new java.awt.Frame(), true);
        ae.setAttributes(atts);
        ae.setVisible(true);
    }

    public Geometry removeSelection(int selectionLine) {
        Geometry geom = gl.getGeometries().get(selectionLine);
        gl.remove(geom);
        return geom;
    }

    public void toggleRulers(int selectionLine) {
        if (selectionLine != -1) {
            if (vdslayer.tagExists(Constant.PREF_AZIMUTH_GEOMETRYTAG)) {
                vdslayer.removeGeometriesByTag(Constant.PREF_AZIMUTH_GEOMETRYTAG);
            } else {
            	try {
	                // get the position of the boat
	                Geometry geom = gl.getGeometries().get(selectionLine);
	                int posX = (int) geom.getCoordinate().x;
	                int posY = (int) geom.getCoordinate().y;
	                // calculate satellite speed
	                String tstart=((SarImageReader)il.getImageReader()).getTimeStampStart();
	                String tstop=((SarImageReader)il.getImageReader()).getTimeStampStop();
	                double seconds = ((Timestamp.valueOf(tstart).getTime() - (Timestamp.valueOf(tstop).getTime()))) / 1000;
	                // calculate satellite speed in azimuth pixels / seconds
	                double azimuthpixelspeed = (double) il.getImageReader().getHeight() / seconds;
	                // calculate the earth angular speed
	                double earthangularSpeed = 2 * Math.PI / 24 / 3600;
	                // calculate earth radius at target point lattitude
	                double radius;
				
					radius = 6400 * 1000 * Math.cos(2 * Math.PI * il.getImageReader().getGeoTransform().getGeoFromPixel(posX, posY)[1] / 360.0);
	                // calculate the range azimuth pixel speed due to the rotation of the earth
	                double rangepixelspeed = earthangularSpeed * radius / il.getImageReader().getPixelsize()[0];
	                // calculate the pixels delta value
	                double azi=((SarImageReader)il.getImageReader()).getImageAzimuth();
	                double pixeldelta = 1 / (Math.cos(azi * 2 * Math.PI / 360.0) / (azimuthpixelspeed / rangepixelspeed - Math.sin(azi * 2 * Math.PI / 360.0)));
	
	                // get the mode
	                int direction = Math.abs(azi) > 90 ? -1 : 1;
	                // create new geometry
	                GeometryFactory gf = new GeometryFactory();
	                // generate the geometry for the target shape
	                List<Geometry> winGeom = new ArrayList<Geometry>();
	                Coordinate[] coordinatesvertical = new Coordinate[2];
	                coordinatesvertical[0] = new Coordinate(posX + direction * (0 - posY) / pixeldelta, 0);
	                coordinatesvertical[1] = new Coordinate(posX + direction * (il.getImageReader().getHeight() - posY) / pixeldelta, il.getImageReader().getHeight());
	                winGeom.add(gf.createLineString(coordinatesvertical));
	                Coordinate[] coordinateshorizontal = new Coordinate[2];
	                coordinateshorizontal[0] = new Coordinate(0, posY);
	                coordinateshorizontal[1] = new Coordinate(il.getImageReader().getWidth(), posY);
	                winGeom.add(gf.createLineString(coordinateshorizontal));
	                vdslayer.addGeometries(Constant.PREF_AZIMUTH_GEOMETRYTAG, this.azimuthGeometrycolor, this.azimuthGeometrylinewidth, GeometryImage.LINESTRING, winGeom, true);
				} catch (Exception e) {
					logger.error(e.getMessage());
				}   
            }
        }
        SumoPlatform.getApplication().getGeoContext().setDirty(true);
    }
}
