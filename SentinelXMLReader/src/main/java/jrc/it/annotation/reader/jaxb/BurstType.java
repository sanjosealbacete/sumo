//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.05 at 04:36:39 PM CET 
//


package jrc.it.annotation.reader.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Annotation record for a burst table entry.
 * 
 * <p>Java class for burstType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="burstType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="azimuthTime" type="{}timeType"/>
 *         &lt;element name="azimuthAnxTime" type="{}double"/>
 *         &lt;element name="sensingTime" type="{}timeType"/>
 *         &lt;element name="byteOffset" type="{}uint64"/>
 *         &lt;element name="firstValidSample" type="{}intArray"/>
 *         &lt;element name="lastValidSample" type="{}intArray"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "burstType", propOrder = {
    "azimuthTime",
    "azimuthAnxTime",
    "sensingTime",
    "byteOffset",
    "firstValidSample",
    "lastValidSample"
})
public class BurstType {

    @XmlElement(required = true)
    protected XMLGregorianCalendar azimuthTime;
    @XmlElement(required = true)
    protected Double azimuthAnxTime;
    @XmlElement(required = true)
    protected XMLGregorianCalendar sensingTime;
    @XmlElement(required = true)
    protected Uint64 byteOffset;
    @XmlElement(required = true)
    protected IntArray firstValidSample;
    @XmlElement(required = true)
    protected IntArray lastValidSample;

    /**
     * Gets the value of the azimuthTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAzimuthTime() {
        return azimuthTime;
    }

    /**
     * Sets the value of the azimuthTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAzimuthTime(XMLGregorianCalendar value) {
        this.azimuthTime = value;
    }

    /**
     * Gets the value of the azimuthAnxTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAzimuthAnxTime() {
        return azimuthAnxTime;
    }

    /**
     * Sets the value of the azimuthAnxTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAzimuthAnxTime(Double value) {
        this.azimuthAnxTime = value;
    }

    /**
     * Gets the value of the sensingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSensingTime() {
        return sensingTime;
    }

    /**
     * Sets the value of the sensingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSensingTime(XMLGregorianCalendar value) {
        this.sensingTime = value;
    }

    /**
     * Gets the value of the byteOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Uint64 }
     *     
     */
    public Uint64 getByteOffset() {
        return byteOffset;
    }

    /**
     * Sets the value of the byteOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint64 }
     *     
     */
    public void setByteOffset(Uint64 value) {
        this.byteOffset = value;
    }

    /**
     * Gets the value of the firstValidSample property.
     * 
     * @return
     *     possible object is
     *     {@link IntArray }
     *     
     */
    public IntArray getFirstValidSample() {
        return firstValidSample;
    }

    /**
     * Sets the value of the firstValidSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntArray }
     *     
     */
    public void setFirstValidSample(IntArray value) {
        this.firstValidSample = value;
    }

    /**
     * Gets the value of the lastValidSample property.
     * 
     * @return
     *     possible object is
     *     {@link IntArray }
     *     
     */
    public IntArray getLastValidSample() {
        return lastValidSample;
    }

    /**
     * Sets the value of the lastValidSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntArray }
     *     
     */
    public void setLastValidSample(IntArray value) {
        this.lastValidSample = value;
    }

}
