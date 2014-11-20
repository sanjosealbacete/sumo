/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geoimage.viewer.actions;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import org.geoimage.utils.IProgress;
import org.geoimage.viewer.core.Platform;
import org.geoimage.viewer.core.api.Argument;
import org.geoimage.viewer.core.api.GeometricLayer;
import org.geoimage.viewer.core.api.IConsoleAction;
import org.geoimage.viewer.core.api.IImageLayer;
import org.geoimage.viewer.core.factory.VectorIOFactory;
import org.geoimage.viewer.core.io.AbstractVectorIO;
import org.geoimage.viewer.core.layers.vectors.SimpleEditVectorLayer;

/**
 *
 * @author thoorfr.
 * this class is called when you want to load a coast line for an active image. The land mask is based on the GSHHS shapefile which is situated on /org/geoimage/viewer/core/resources/shapefile/.
 * 
 */
public class AddWorldLayerAction implements IConsoleAction, IProgress {

    private boolean done = false;

    public AddWorldLayerAction() {
    }

    public String getName() {
        return "Coastline";
    }

    public String getDescription() {
        return " Add a land mask layer";
    }

    public boolean execute(final String[] args) {
        done = false;
        new Thread(new Runnable() {

            public void run() {
                Platform.setInfo("Importing land coastline ",-1);
                try {
                	IImageLayer  l=Platform.getCurrentImageLayer();
                	if(l!=null){
                        try {
                            URL url = this.getClass().getResource("/org/geoimage/viewer/core/resources/shapefile/Global GSHHS Land Mask.shp");
                            Map config=new HashMap();
                            config.put("url", url);
                            AbstractVectorIO shpio = VectorIOFactory.createVectorIO(VectorIOFactory.SIMPLE_SHAPEFILE, config);
                            GeometricLayer gl = shpio.read(l.getImageReader());
                            addLayerInThread(gl, (IImageLayer) l);
                        } catch (Exception ex) {
                            Logger.getLogger(AddWorldLayerAction.class.getName()).log(Level.SEVERE, null, ex);
                        }
                	}   
                } catch (Exception e) {
                }
                Platform.setInfo(null);
            }
        }).start();
        return true;
    }

    public void addLayerInThread(final GeometricLayer layer, final IImageLayer il) {
        if(layer != null)
        {
            new Thread(new Runnable() {

                public void run() {
                    il.addLayer(new SimpleEditVectorLayer(layer.getName(), il.getImageReader(), layer.getGeometryType(), layer));
                    done = true;
                }
            }).start();
        } else {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JOptionPane.showMessageDialog(null, "Empty layer, not added to layers", "Warning", JOptionPane.ERROR_MESSAGE);
                }
            });
            done = true;
        }
    }

    public String getPath() {
        return "Import/Coastline";
    }

    public boolean isIndeterminate() {
        return true;
    }

    public boolean isDone() {
        return done;
    }

    public int getMaximum() {
        return 1;
    }

    public int getCurrent() {
        return 1;
    }

    public String getMessage() {
        return "adding world layer...";
    }

    public List<Argument> getArgumentTypes() {
        return null;
    }

    public void setCurrent(int i) {
    }

    public void setMaximum(int size) {
    }

    public void setMessage(String string) {
    }

    public void setIndeterminate(boolean value) {
    }

    public void setDone(boolean value) {
    }
}
