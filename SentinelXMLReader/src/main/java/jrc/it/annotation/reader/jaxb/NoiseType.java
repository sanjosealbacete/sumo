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
 * Annotation record for noise packet information.
 * 
 * <p>Java class for noiseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="noiseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="swath" type="{}swathType"/>
 *         &lt;element name="azimuthTime" type="{}timeType"/>
 *         &lt;element name="noisePowerCorrectionFactor" type="{}float"/>
 *         &lt;element name="numberOfNoiseLines" type="{}uint32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "noiseType", propOrder = {
    "swath",
    "azimuthTime",
    "noisePowerCorrectionFactor",
    "numberOfNoiseLines"
})
public class NoiseType {

    @XmlElement(required = true)
    protected SwathType swath;
    @XmlElement(required = true)
    protected XMLGregorianCalendar azimuthTime;
    @XmlElement(required = true)
    protected Float noisePowerCorrectionFactor;
    @XmlElement(required = true)
    protected Uint32 numberOfNoiseLines;

    /**
     * Gets the value of the swath property.
     * 
     * @return
     *     possible object is
     *     {@link SwathType }
     *     
     */
    public SwathType getSwath() {
        return swath;
    }

    /**
     * Sets the value of the swath property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwathType }
     *     
     */
    public void setSwath(SwathType value) {
        this.swath = value;
    }

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
     * Gets the value of the noisePowerCorrectionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNoisePowerCorrectionFactor() {
        return noisePowerCorrectionFactor;
    }

    /**
     * Sets the value of the noisePowerCorrectionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNoisePowerCorrectionFactor(Float value) {
        this.noisePowerCorrectionFactor = value;
    }

    /**
     * Gets the value of the numberOfNoiseLines property.
     * 
     * @return
     *     possible object is
     *     {@link Uint32 }
     *     
     */
    public Uint32 getNumberOfNoiseLines() {
        return numberOfNoiseLines;
    }

    /**
     * Sets the value of the numberOfNoiseLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint32 }
     *     
     */
    public void setNumberOfNoiseLines(Uint32 value) {
        this.numberOfNoiseLines = value;
    }

}
