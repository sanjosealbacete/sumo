//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.24 at 04:43:09 PM CEST 
//


package safe.annotation;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence>
 *         &lt;element ref="{}azimuthTime"/>
 *         &lt;element ref="{}azimuthAnxTime"/>
 *         &lt;element ref="{}sensingTime"/>
 *         &lt;element ref="{}byteOffset"/>
 *         &lt;element ref="{}firstValidSample"/>
 *         &lt;element ref="{}lastValidSample"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "azimuthTime",
    "azimuthAnxTime",
    "sensingTime",
    "byteOffset",
    "firstValidSample",
    "lastValidSample"
})
@XmlRootElement(name = "burst")
public class Burst {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String azimuthTime;
    protected double azimuthAnxTime;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String sensingTime;
    @XmlElement(required = true)
    protected BigInteger byteOffset;
    @XmlElement(required = true)
    protected FirstValidSample firstValidSample;
    @XmlElement(required = true)
    protected LastValidSample lastValidSample;

    /**
     * Gets the value of the azimuthTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzimuthTime() {
        return azimuthTime;
    }

    /**
     * Sets the value of the azimuthTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzimuthTime(String value) {
        this.azimuthTime = value;
    }

    /**
     * Gets the value of the azimuthAnxTime property.
     * 
     */
    public double getAzimuthAnxTime() {
        return azimuthAnxTime;
    }

    /**
     * Sets the value of the azimuthAnxTime property.
     * 
     */
    public void setAzimuthAnxTime(double value) {
        this.azimuthAnxTime = value;
    }

    /**
     * Gets the value of the sensingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensingTime() {
        return sensingTime;
    }

    /**
     * Sets the value of the sensingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensingTime(String value) {
        this.sensingTime = value;
    }

    /**
     * Gets the value of the byteOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByteOffset() {
        return byteOffset;
    }

    /**
     * Sets the value of the byteOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByteOffset(BigInteger value) {
        this.byteOffset = value;
    }

    /**
     * Gets the value of the firstValidSample property.
     * 
     * @return
     *     possible object is
     *     {@link FirstValidSample }
     *     
     */
    public FirstValidSample getFirstValidSample() {
        return firstValidSample;
    }

    /**
     * Sets the value of the firstValidSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstValidSample }
     *     
     */
    public void setFirstValidSample(FirstValidSample value) {
        this.firstValidSample = value;
    }

    /**
     * Gets the value of the lastValidSample property.
     * 
     * @return
     *     possible object is
     *     {@link LastValidSample }
     *     
     */
    public LastValidSample getLastValidSample() {
        return lastValidSample;
    }

    /**
     * Sets the value of the lastValidSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastValidSample }
     *     
     */
    public void setLastValidSample(LastValidSample value) {
        this.lastValidSample = value;
    }

}
