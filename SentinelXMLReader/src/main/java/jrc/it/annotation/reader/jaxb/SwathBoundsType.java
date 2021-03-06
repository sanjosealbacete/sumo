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
 * Annotation record for swath boundary information.
 * 
 * <p>Java class for swathBoundsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="swathBoundsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="azimuthTime" type="{}timeType"/>
 *         &lt;element name="firstAzimuthLine" type="{}uint32"/>
 *         &lt;element name="firstRangeSample" type="{}uint32"/>
 *         &lt;element name="lastAzimuthLine" type="{}uint32"/>
 *         &lt;element name="lastRangeSample" type="{}uint32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "swathBoundsType", propOrder = {
    "azimuthTime",
    "firstAzimuthLine",
    "firstRangeSample",
    "lastAzimuthLine",
    "lastRangeSample"
})
public class SwathBoundsType {

    @XmlElement(required = true)
    protected XMLGregorianCalendar azimuthTime;
    @XmlElement(required = true)
    protected Uint32 firstAzimuthLine;
    @XmlElement(required = true)
    protected Uint32 firstRangeSample;
    @XmlElement(required = true)
    protected Uint32 lastAzimuthLine;
    @XmlElement(required = true)
    protected Uint32 lastRangeSample;

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
     * Gets the value of the firstAzimuthLine property.
     * 
     * @return
     *     possible object is
     *     {@link Uint32 }
     *     
     */
    public Uint32 getFirstAzimuthLine() {
        return firstAzimuthLine;
    }

    /**
     * Sets the value of the firstAzimuthLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint32 }
     *     
     */
    public void setFirstAzimuthLine(Uint32 value) {
        this.firstAzimuthLine = value;
    }

    /**
     * Gets the value of the firstRangeSample property.
     * 
     * @return
     *     possible object is
     *     {@link Uint32 }
     *     
     */
    public Uint32 getFirstRangeSample() {
        return firstRangeSample;
    }

    /**
     * Sets the value of the firstRangeSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint32 }
     *     
     */
    public void setFirstRangeSample(Uint32 value) {
        this.firstRangeSample = value;
    }

    /**
     * Gets the value of the lastAzimuthLine property.
     * 
     * @return
     *     possible object is
     *     {@link Uint32 }
     *     
     */
    public Uint32 getLastAzimuthLine() {
        return lastAzimuthLine;
    }

    /**
     * Sets the value of the lastAzimuthLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint32 }
     *     
     */
    public void setLastAzimuthLine(Uint32 value) {
        this.lastAzimuthLine = value;
    }

    /**
     * Gets the value of the lastRangeSample property.
     * 
     * @return
     *     possible object is
     *     {@link Uint32 }
     *     
     */
    public Uint32 getLastRangeSample() {
        return lastRangeSample;
    }

    /**
     * Sets the value of the lastRangeSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint32 }
     *     
     */
    public void setLastRangeSample(Uint32 value) {
        this.lastRangeSample = value;
    }

}
