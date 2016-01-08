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


/**
 * Annotation record for downlink quality information.
 * 
 * <p>Java class for downlinkQualityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downlinkQualityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iInputDataMean" type="{}double"/>
 *         &lt;element name="qInputDataMean" type="{}double"/>
 *         &lt;element name="inputDataMeanOutsideNominalRangeFlag" type="{}bool"/>
 *         &lt;element name="iInputDataStdDev" type="{}double"/>
 *         &lt;element name="qInputDataStdDev" type="{}double"/>
 *         &lt;element name="inputDataStDevOutsideNominalRangeFlag" type="{}bool"/>
 *         &lt;element name="numDownlinkInputDataGaps" type="{}uint32"/>
 *         &lt;element name="downlinkGapsInInputDataSignificantFlag" type="{}bool"/>
 *         &lt;element name="numDownlinkInputMissingLines" type="{}uint32"/>
 *         &lt;element name="downlinkMissingLinesSignificantFlag" type="{}bool"/>
 *         &lt;element name="numInstrumentInputDataGaps" type="{}uint32"/>
 *         &lt;element name="instrumentGapsInInputDataSignificantFlag" type="{}bool"/>
 *         &lt;element name="numInstrumentInputMissingLines" type="{}uint32"/>
 *         &lt;element name="instrumentMissingLinesSignificantFlag" type="{}bool"/>
 *         &lt;element name="numSsbErrorInputDataGaps" type="{}uint32"/>
 *         &lt;element name="ssbErrorGapsInInputDataSignificantFlag" type="{}bool"/>
 *         &lt;element name="numSsbErrorInputMissingLines" type="{}uint32"/>
 *         &lt;element name="ssbErrorMissingLinesSignificantFlag" type="{}bool"/>
 *         &lt;element name="chirpSourceUsed" type="{}chirpSourceType"/>
 *         &lt;element name="pgSourceUsed" type="{}pgSourceType"/>
 *         &lt;element name="rrfSpectrumUsed" type="{}rrfSpectrumType"/>
 *         &lt;element name="replicaReconstructionFailedFlag" type="{}bool"/>
 *         &lt;element name="meanPgProductAmplitude" type="{}double"/>
 *         &lt;element name="stdDevPgProductAmplitude" type="{}double"/>
 *         &lt;element name="meanPgProductPhase" type="{}double"/>
 *         &lt;element name="stdDevPgProductPhase" type="{}double"/>
 *         &lt;element name="pgProductDerivationFailedFlag" type="{}bool"/>
 *         &lt;element name="invalidDownlinkParamsFlag" type="{}bool"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downlinkQualityType", propOrder = {
    "iInputDataMean",
    "qInputDataMean",
    "inputDataMeanOutsideNominalRangeFlag",
    "iInputDataStdDev",
    "qInputDataStdDev",
    "inputDataStDevOutsideNominalRangeFlag",
    "numDownlinkInputDataGaps",
    "downlinkGapsInInputDataSignificantFlag",
    "numDownlinkInputMissingLines",
    "downlinkMissingLinesSignificantFlag",
    "numInstrumentInputDataGaps",
    "instrumentGapsInInputDataSignificantFlag",
    "numInstrumentInputMissingLines",
    "instrumentMissingLinesSignificantFlag",
    "numSsbErrorInputDataGaps",
    "ssbErrorGapsInInputDataSignificantFlag",
    "numSsbErrorInputMissingLines",
    "ssbErrorMissingLinesSignificantFlag",
    "chirpSourceUsed",
    "pgSourceUsed",
    "rrfSpectrumUsed",
    "replicaReconstructionFailedFlag",
    "meanPgProductAmplitude",
    "stdDevPgProductAmplitude",
    "meanPgProductPhase",
    "stdDevPgProductPhase",
    "pgProductDerivationFailedFlag",
    "invalidDownlinkParamsFlag"
})
public class DownlinkQualityType {

    @XmlElement(required = true)
    protected Double iInputDataMean;
    @XmlElement(required = true)
    protected Double qInputDataMean;
    protected boolean inputDataMeanOutsideNominalRangeFlag;
    @XmlElement(required = true)
    protected Double iInputDataStdDev;
    @XmlElement(required = true)
    protected Double qInputDataStdDev;
    protected boolean inputDataStDevOutsideNominalRangeFlag;
    @XmlElement(required = true)
    protected Uint32 numDownlinkInputDataGaps;
    protected boolean downlinkGapsInInputDataSignificantFlag;
    @XmlElement(required = true)
    protected Uint32 numDownlinkInputMissingLines;
    protected boolean downlinkMissingLinesSignificantFlag;
    @XmlElement(required = true)
    protected Uint32 numInstrumentInputDataGaps;
    protected boolean instrumentGapsInInputDataSignificantFlag;
    @XmlElement(required = true)
    protected Uint32 numInstrumentInputMissingLines;
    protected boolean instrumentMissingLinesSignificantFlag;
    @XmlElement(required = true)
    protected Uint32 numSsbErrorInputDataGaps;
    protected boolean ssbErrorGapsInInputDataSignificantFlag;
    @XmlElement(required = true)
    protected Uint32 numSsbErrorInputMissingLines;
    protected boolean ssbErrorMissingLinesSignificantFlag;
    @XmlElement(required = true)
    protected ChirpSourceType chirpSourceUsed;
    @XmlElement(required = true)
    protected PgSourceType pgSourceUsed;
    @XmlElement(required = true)
    protected RrfSpectrumType rrfSpectrumUsed;
    protected boolean replicaReconstructionFailedFlag;
    @XmlElement(required = true)
    protected Double meanPgProductAmplitude;
    @XmlElement(required = true)
    protected Double stdDevPgProductAmplitude;
    @XmlElement(required = true)
    protected Double meanPgProductPhase;
    @XmlElement(required = true)
    protected Double stdDevPgProductPhase;
    protected boolean pgProductDerivationFailedFlag;
    protected boolean invalidDownlinkParamsFlag;

    /**
     * Gets the value of the iInputDataMean property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIInputDataMean() {
        return iInputDataMean;
    }

    /**
     * Sets the value of the iInputDataMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIInputDataMean(Double value) {
        this.iInputDataMean = value;
    }

    /**
     * Gets the value of the qInputDataMean property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQInputDataMean() {
        return qInputDataMean;
    }

    /**
     * Sets the value of the qInputDataMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQInputDataMean(Double value) {
        this.qInputDataMean = value;
    }

    /**
     * Gets the value of the inputDataMeanOutsideNominalRangeFlag property.
     * 
     */
    public boolean isInputDataMeanOutsideNominalRangeFlag() {
        return inputDataMeanOutsideNominalRangeFlag;
    }

    /**
     * Sets the value of the inputDataMeanOutsideNominalRangeFlag property.
     * 
     */
    public void setInputDataMeanOutsideNominalRangeFlag(boolean value) {
        this.inputDataMeanOutsideNominalRangeFlag = value;
    }

    /**
     * Gets the value of the iInputDataStdDev property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIInputDataStdDev() {
        return iInputDataStdDev;
    }

    /**
     * Sets the value of the iInputDataStdDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIInputDataStdDev(Double value) {
        this.iInputDataStdDev = value;
    }

    /**
     * Gets the value of the qInputDataStdDev property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQInputDataStdDev() {
        return qInputDataStdDev;
    }

    /**
     * Sets the value of the qInputDataStdDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQInputDataStdDev(Double value) {
        this.qInputDataStdDev = value;
    }

    /**
     * Gets the value of the inputDataStDevOutsideNominalRangeFlag property.
     * 
     */
    public boolean isInputDataStDevOutsideNominalRangeFlag() {
        return inputDataStDevOutsideNominalRangeFlag;
    }

    /**
     * Sets the value of the inputDataStDevOutsideNominalRangeFlag property.
     * 
     */
    public void setInputDataStDevOutsideNominalRangeFlag(boolean value) {
        this.inputDataStDevOutsideNominalRangeFlag = value;
    }

    /**
     * Gets the value of the numDownlinkInputDataGaps property.
     * 
     * @return
     *     possible object is
     *     {@link Uint32 }
     *     
     */
    public Uint32 getNumDownlinkInputDataGaps() {
        return numDownlinkInputDataGaps;
    }

    /**
     * Sets the value of the numDownlinkInputDataGaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint32 }
     *     
     */
    public void setNumDownlinkInputDataGaps(Uint32 value) {
        this.numDownlinkInputDataGaps = value;
    }

    /**
     * Gets the value of the downlinkGapsInInputDataSignificantFlag property.
     * 
     */
    public boolean isDownlinkGapsInInputDataSignificantFlag() {
        return downlinkGapsInInputDataSignificantFlag;
    }

    /**
     * Sets the value of the downlinkGapsInInputDataSignificantFlag property.
     * 
     */
    public void setDownlinkGapsInInputDataSignificantFlag(boolean value) {
        this.downlinkGapsInInputDataSignificantFlag = value;
    }

    /**
     * Gets the value of the numDownlinkInputMissingLines property.
     * 
     * @return
     *     possible object is
     *     {@link Uint32 }
     *     
     */
    public Uint32 getNumDownlinkInputMissingLines() {
        return numDownlinkInputMissingLines;
    }

    /**
     * Sets the value of the numDownlinkInputMissingLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint32 }
     *     
     */
    public void setNumDownlinkInputMissingLines(Uint32 value) {
        this.numDownlinkInputMissingLines = value;
    }

    /**
     * Gets the value of the downlinkMissingLinesSignificantFlag property.
     * 
     */
    public boolean isDownlinkMissingLinesSignificantFlag() {
        return downlinkMissingLinesSignificantFlag;
    }

    /**
     * Sets the value of the downlinkMissingLinesSignificantFlag property.
     * 
     */
    public void setDownlinkMissingLinesSignificantFlag(boolean value) {
        this.downlinkMissingLinesSignificantFlag = value;
    }

    /**
     * Gets the value of the numInstrumentInputDataGaps property.
     * 
     * @return
     *     possible object is
     *     {@link Uint32 }
     *     
     */
    public Uint32 getNumInstrumentInputDataGaps() {
        return numInstrumentInputDataGaps;
    }

    /**
     * Sets the value of the numInstrumentInputDataGaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint32 }
     *     
     */
    public void setNumInstrumentInputDataGaps(Uint32 value) {
        this.numInstrumentInputDataGaps = value;
    }

    /**
     * Gets the value of the instrumentGapsInInputDataSignificantFlag property.
     * 
     */
    public boolean isInstrumentGapsInInputDataSignificantFlag() {
        return instrumentGapsInInputDataSignificantFlag;
    }

    /**
     * Sets the value of the instrumentGapsInInputDataSignificantFlag property.
     * 
     */
    public void setInstrumentGapsInInputDataSignificantFlag(boolean value) {
        this.instrumentGapsInInputDataSignificantFlag = value;
    }

    /**
     * Gets the value of the numInstrumentInputMissingLines property.
     * 
     * @return
     *     possible object is
     *     {@link Uint32 }
     *     
     */
    public Uint32 getNumInstrumentInputMissingLines() {
        return numInstrumentInputMissingLines;
    }

    /**
     * Sets the value of the numInstrumentInputMissingLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint32 }
     *     
     */
    public void setNumInstrumentInputMissingLines(Uint32 value) {
        this.numInstrumentInputMissingLines = value;
    }

    /**
     * Gets the value of the instrumentMissingLinesSignificantFlag property.
     * 
     */
    public boolean isInstrumentMissingLinesSignificantFlag() {
        return instrumentMissingLinesSignificantFlag;
    }

    /**
     * Sets the value of the instrumentMissingLinesSignificantFlag property.
     * 
     */
    public void setInstrumentMissingLinesSignificantFlag(boolean value) {
        this.instrumentMissingLinesSignificantFlag = value;
    }

    /**
     * Gets the value of the numSsbErrorInputDataGaps property.
     * 
     * @return
     *     possible object is
     *     {@link Uint32 }
     *     
     */
    public Uint32 getNumSsbErrorInputDataGaps() {
        return numSsbErrorInputDataGaps;
    }

    /**
     * Sets the value of the numSsbErrorInputDataGaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint32 }
     *     
     */
    public void setNumSsbErrorInputDataGaps(Uint32 value) {
        this.numSsbErrorInputDataGaps = value;
    }

    /**
     * Gets the value of the ssbErrorGapsInInputDataSignificantFlag property.
     * 
     */
    public boolean isSsbErrorGapsInInputDataSignificantFlag() {
        return ssbErrorGapsInInputDataSignificantFlag;
    }

    /**
     * Sets the value of the ssbErrorGapsInInputDataSignificantFlag property.
     * 
     */
    public void setSsbErrorGapsInInputDataSignificantFlag(boolean value) {
        this.ssbErrorGapsInInputDataSignificantFlag = value;
    }

    /**
     * Gets the value of the numSsbErrorInputMissingLines property.
     * 
     * @return
     *     possible object is
     *     {@link Uint32 }
     *     
     */
    public Uint32 getNumSsbErrorInputMissingLines() {
        return numSsbErrorInputMissingLines;
    }

    /**
     * Sets the value of the numSsbErrorInputMissingLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uint32 }
     *     
     */
    public void setNumSsbErrorInputMissingLines(Uint32 value) {
        this.numSsbErrorInputMissingLines = value;
    }

    /**
     * Gets the value of the ssbErrorMissingLinesSignificantFlag property.
     * 
     */
    public boolean isSsbErrorMissingLinesSignificantFlag() {
        return ssbErrorMissingLinesSignificantFlag;
    }

    /**
     * Sets the value of the ssbErrorMissingLinesSignificantFlag property.
     * 
     */
    public void setSsbErrorMissingLinesSignificantFlag(boolean value) {
        this.ssbErrorMissingLinesSignificantFlag = value;
    }

    /**
     * Gets the value of the chirpSourceUsed property.
     * 
     * @return
     *     possible object is
     *     {@link ChirpSourceType }
     *     
     */
    public ChirpSourceType getChirpSourceUsed() {
        return chirpSourceUsed;
    }

    /**
     * Sets the value of the chirpSourceUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChirpSourceType }
     *     
     */
    public void setChirpSourceUsed(ChirpSourceType value) {
        this.chirpSourceUsed = value;
    }

    /**
     * Gets the value of the pgSourceUsed property.
     * 
     * @return
     *     possible object is
     *     {@link PgSourceType }
     *     
     */
    public PgSourceType getPgSourceUsed() {
        return pgSourceUsed;
    }

    /**
     * Sets the value of the pgSourceUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PgSourceType }
     *     
     */
    public void setPgSourceUsed(PgSourceType value) {
        this.pgSourceUsed = value;
    }

    /**
     * Gets the value of the rrfSpectrumUsed property.
     * 
     * @return
     *     possible object is
     *     {@link RrfSpectrumType }
     *     
     */
    public RrfSpectrumType getRrfSpectrumUsed() {
        return rrfSpectrumUsed;
    }

    /**
     * Sets the value of the rrfSpectrumUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link RrfSpectrumType }
     *     
     */
    public void setRrfSpectrumUsed(RrfSpectrumType value) {
        this.rrfSpectrumUsed = value;
    }

    /**
     * Gets the value of the replicaReconstructionFailedFlag property.
     * 
     */
    public boolean isReplicaReconstructionFailedFlag() {
        return replicaReconstructionFailedFlag;
    }

    /**
     * Sets the value of the replicaReconstructionFailedFlag property.
     * 
     */
    public void setReplicaReconstructionFailedFlag(boolean value) {
        this.replicaReconstructionFailedFlag = value;
    }

    /**
     * Gets the value of the meanPgProductAmplitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeanPgProductAmplitude() {
        return meanPgProductAmplitude;
    }

    /**
     * Sets the value of the meanPgProductAmplitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeanPgProductAmplitude(Double value) {
        this.meanPgProductAmplitude = value;
    }

    /**
     * Gets the value of the stdDevPgProductAmplitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStdDevPgProductAmplitude() {
        return stdDevPgProductAmplitude;
    }

    /**
     * Sets the value of the stdDevPgProductAmplitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStdDevPgProductAmplitude(Double value) {
        this.stdDevPgProductAmplitude = value;
    }

    /**
     * Gets the value of the meanPgProductPhase property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeanPgProductPhase() {
        return meanPgProductPhase;
    }

    /**
     * Sets the value of the meanPgProductPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeanPgProductPhase(Double value) {
        this.meanPgProductPhase = value;
    }

    /**
     * Gets the value of the stdDevPgProductPhase property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStdDevPgProductPhase() {
        return stdDevPgProductPhase;
    }

    /**
     * Sets the value of the stdDevPgProductPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStdDevPgProductPhase(Double value) {
        this.stdDevPgProductPhase = value;
    }

    /**
     * Gets the value of the pgProductDerivationFailedFlag property.
     * 
     */
    public boolean isPgProductDerivationFailedFlag() {
        return pgProductDerivationFailedFlag;
    }

    /**
     * Sets the value of the pgProductDerivationFailedFlag property.
     * 
     */
    public void setPgProductDerivationFailedFlag(boolean value) {
        this.pgProductDerivationFailedFlag = value;
    }

    /**
     * Gets the value of the invalidDownlinkParamsFlag property.
     * 
     */
    public boolean isInvalidDownlinkParamsFlag() {
        return invalidDownlinkParamsFlag;
    }

    /**
     * Sets the value of the invalidDownlinkParamsFlag property.
     * 
     */
    public void setInvalidDownlinkParamsFlag(boolean value) {
        this.invalidDownlinkParamsFlag = value;
    }

}
