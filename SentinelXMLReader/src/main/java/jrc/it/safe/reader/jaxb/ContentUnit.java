//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.27 at 05:01:05 PM CEST 
//


package jrc.it.safe.reader.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{urn:ccsds:schema:xfdu:1}contentUnit"/>
 *         &lt;group ref="{http://www.esa.int/safe/sentinel-1.0}dataObjectPointer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dmdID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="pdiID" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="repID" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="textInfo" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="unitType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contentUnit",
    "dataObjectPointer"
})
@XmlRootElement(name = "contentUnit", namespace = "urn:ccsds:schema:xfdu:1")
public class ContentUnit {

    @XmlElement(namespace = "urn:ccsds:schema:xfdu:1")
    protected ContentUnit contentUnit;
    @XmlElement(namespace = "")
    protected ContentUnit.DataObjectPointer dataObjectPointer;
    @XmlAttribute(name = "dmdID")
    @XmlSchemaType(name = "anySimpleType")
    protected String dmdID;
    @XmlAttribute(name = "pdiID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String pdiID;
    @XmlAttribute(name = "repID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String repID;
    @XmlAttribute(name = "textInfo")
    @XmlSchemaType(name = "anySimpleType")
    protected String textInfo;
    @XmlAttribute(name = "unitType", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String unitType;

    /**
     * Gets the value of the contentUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ContentUnit }
     *     
     */
    public ContentUnit getContentUnit() {
        return contentUnit;
    }

    /**
     * Sets the value of the contentUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentUnit }
     *     
     */
    public void setContentUnit(ContentUnit value) {
        this.contentUnit = value;
    }

    /**
     * Gets the value of the dataObjectPointer property.
     * 
     * @return
     *     possible object is
     *     {@link ContentUnit.DataObjectPointer }
     *     
     */
    public ContentUnit.DataObjectPointer getDataObjectPointer() {
        return dataObjectPointer;
    }

    /**
     * Sets the value of the dataObjectPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentUnit.DataObjectPointer }
     *     
     */
    public void setDataObjectPointer(ContentUnit.DataObjectPointer value) {
        this.dataObjectPointer = value;
    }

    /**
     * Gets the value of the dmdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmdID() {
        return dmdID;
    }

    /**
     * Sets the value of the dmdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmdID(String value) {
        this.dmdID = value;
    }

    /**
     * Gets the value of the pdiID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdiID() {
        return pdiID;
    }

    /**
     * Sets the value of the pdiID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdiID(String value) {
        this.pdiID = value;
    }

    /**
     * Gets the value of the repID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepID() {
        return repID;
    }

    /**
     * Sets the value of the repID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepID(String value) {
        this.repID = value;
    }

    /**
     * Gets the value of the textInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextInfo() {
        return textInfo;
    }

    /**
     * Sets the value of the textInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextInfo(String value) {
        this.textInfo = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="dataObjectID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DataObjectPointer {

        @XmlAttribute(name = "dataObjectID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String dataObjectID;

        /**
         * Gets the value of the dataObjectID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataObjectID() {
            return dataObjectID;
        }

        /**
         * Sets the value of the dataObjectID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataObjectID(String value) {
            this.dataObjectID = value;
        }

    }

}