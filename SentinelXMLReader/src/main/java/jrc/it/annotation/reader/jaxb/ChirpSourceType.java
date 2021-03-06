//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.05 at 04:36:39 PM CET 
//


package jrc.it.annotation.reader.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chirpSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chirpSourceType">
 *   &lt;restriction base="{}string">
 *     &lt;enumeration value="Nominal"/>
 *     &lt;enumeration value="Extracted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chirpSourceType")
@XmlEnum
public enum ChirpSourceType {

    @XmlEnumValue("Nominal")
    NOMINAL("Nominal"),
    @XmlEnumValue("Extracted")
    EXTRACTED("Extracted");
    private final String value;

    ChirpSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChirpSourceType fromValue(String v) {
        for (ChirpSourceType c: ChirpSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
