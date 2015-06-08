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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}pri"/>
 *         &lt;element ref="{}rank"/>
 *         &lt;element ref="{}dataTakeId"/>
 *         &lt;element ref="{}eccNumber"/>
 *         &lt;element ref="{}rxChannelId"/>
 *         &lt;element ref="{}instrumentConfigId"/>
 *         &lt;element ref="{}dataFormat"/>
 *         &lt;element ref="{}rangeDecimation"/>
 *         &lt;element ref="{}rxGain"/>
 *         &lt;element ref="{}txPulseLength"/>
 *         &lt;element ref="{}txPulseStartFrequency"/>
 *         &lt;element ref="{}txPulseRampRate"/>
 *         &lt;element ref="{}swathNumber"/>
 *         &lt;element ref="{}swlList"/>
 *         &lt;element ref="{}swstList"/>
 *         &lt;element ref="{}pointingStatusList"/>
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
    "pri",
    "rank",
    "dataTakeId",
    "eccNumber",
    "rxChannelId",
    "instrumentConfigId",
    "dataFormat",
    "rangeDecimation",
    "rxGain",
    "txPulseLength",
    "txPulseStartFrequency",
    "txPulseRampRate",
    "swathNumber",
    "swlList",
    "swstList",
    "pointingStatusList"
})
@XmlRootElement(name = "downlinkValues")
public class DownlinkValues {

    protected double pri;
    @XmlElement(required = true)
    protected BigInteger rank;
    @XmlElement(required = true)
    protected BigInteger dataTakeId;
    @XmlElement(required = true)
    protected BigInteger eccNumber;
    @XmlElement(required = true)
    protected BigInteger rxChannelId;
    @XmlElement(required = true)
    protected BigInteger instrumentConfigId;
    @XmlElement(required = true)
    protected DataFormat dataFormat;
    @XmlElement(required = true)
    protected RangeDecimation rangeDecimation;
    protected double rxGain;
    protected double txPulseLength;
    protected double txPulseStartFrequency;
    protected double txPulseRampRate;
    @XmlElement(required = true)
    protected BigInteger swathNumber;
    @XmlElement(required = true)
    protected SwlList swlList;
    @XmlElement(required = true)
    protected SwstList swstList;
    @XmlElement(required = true)
    protected PointingStatusList pointingStatusList;

    /**
     * Gets the value of the pri property.
     * 
     */
    public double getPri() {
        return pri;
    }

    /**
     * Sets the value of the pri property.
     * 
     */
    public void setPri(double value) {
        this.pri = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRank(BigInteger value) {
        this.rank = value;
    }

    /**
     * Gets the value of the dataTakeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataTakeId() {
        return dataTakeId;
    }

    /**
     * Sets the value of the dataTakeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataTakeId(BigInteger value) {
        this.dataTakeId = value;
    }

    /**
     * Gets the value of the eccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEccNumber() {
        return eccNumber;
    }

    /**
     * Sets the value of the eccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEccNumber(BigInteger value) {
        this.eccNumber = value;
    }

    /**
     * Gets the value of the rxChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRxChannelId() {
        return rxChannelId;
    }

    /**
     * Sets the value of the rxChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRxChannelId(BigInteger value) {
        this.rxChannelId = value;
    }

    /**
     * Gets the value of the instrumentConfigId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstrumentConfigId() {
        return instrumentConfigId;
    }

    /**
     * Sets the value of the instrumentConfigId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstrumentConfigId(BigInteger value) {
        this.instrumentConfigId = value;
    }

    /**
     * Gets the value of the dataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DataFormat }
     *     
     */
    public DataFormat getDataFormat() {
        return dataFormat;
    }

    /**
     * Sets the value of the dataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFormat }
     *     
     */
    public void setDataFormat(DataFormat value) {
        this.dataFormat = value;
    }

    /**
     * Gets the value of the rangeDecimation property.
     * 
     * @return
     *     possible object is
     *     {@link RangeDecimation }
     *     
     */
    public RangeDecimation getRangeDecimation() {
        return rangeDecimation;
    }

    /**
     * Sets the value of the rangeDecimation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeDecimation }
     *     
     */
    public void setRangeDecimation(RangeDecimation value) {
        this.rangeDecimation = value;
    }

    /**
     * Gets the value of the rxGain property.
     * 
     */
    public double getRxGain() {
        return rxGain;
    }

    /**
     * Sets the value of the rxGain property.
     * 
     */
    public void setRxGain(double value) {
        this.rxGain = value;
    }

    /**
     * Gets the value of the txPulseLength property.
     * 
     */
    public double getTxPulseLength() {
        return txPulseLength;
    }

    /**
     * Sets the value of the txPulseLength property.
     * 
     */
    public void setTxPulseLength(double value) {
        this.txPulseLength = value;
    }

    /**
     * Gets the value of the txPulseStartFrequency property.
     * 
     */
    public double getTxPulseStartFrequency() {
        return txPulseStartFrequency;
    }

    /**
     * Sets the value of the txPulseStartFrequency property.
     * 
     */
    public void setTxPulseStartFrequency(double value) {
        this.txPulseStartFrequency = value;
    }

    /**
     * Gets the value of the txPulseRampRate property.
     * 
     */
    public double getTxPulseRampRate() {
        return txPulseRampRate;
    }

    /**
     * Sets the value of the txPulseRampRate property.
     * 
     */
    public void setTxPulseRampRate(double value) {
        this.txPulseRampRate = value;
    }

    /**
     * Gets the value of the swathNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSwathNumber() {
        return swathNumber;
    }

    /**
     * Sets the value of the swathNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSwathNumber(BigInteger value) {
        this.swathNumber = value;
    }

    /**
     * Gets the value of the swlList property.
     * 
     * @return
     *     possible object is
     *     {@link SwlList }
     *     
     */
    public SwlList getSwlList() {
        return swlList;
    }

    /**
     * Sets the value of the swlList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwlList }
     *     
     */
    public void setSwlList(SwlList value) {
        this.swlList = value;
    }

    /**
     * Gets the value of the swstList property.
     * 
     * @return
     *     possible object is
     *     {@link SwstList }
     *     
     */
    public SwstList getSwstList() {
        return swstList;
    }

    /**
     * Sets the value of the swstList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwstList }
     *     
     */
    public void setSwstList(SwstList value) {
        this.swstList = value;
    }

    /**
     * Gets the value of the pointingStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link PointingStatusList }
     *     
     */
    public PointingStatusList getPointingStatusList() {
        return pointingStatusList;
    }

    /**
     * Sets the value of the pointingStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointingStatusList }
     *     
     */
    public void setPointingStatusList(PointingStatusList value) {
        this.pointingStatusList = value;
    }

}