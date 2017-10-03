
package com.vodafone.mock.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="afternoonEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="afternoonStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="morningEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="morningStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="possibleFixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryData", namespace = "http://expectedtimedelivery.ws.g4s.netlife.hu/", propOrder = {
    "afternoonEnd",
    "afternoonStart",
    "area",
    "city",
    "morningEnd",
    "morningStart",
    "possibleFixed",
    "zipcode"
})
public class DeliveryData {

    protected int afternoonEnd;
    protected int afternoonStart;
    @XmlElement(required = true)
    protected String area;
    @XmlElement(required = true)
    protected String city;
    protected int morningEnd;
    protected int morningStart;
    protected boolean possibleFixed;
    protected int zipcode;

    /**
     * Gets the value of the afternoonEnd property.
     * 
     */
    public int getAfternoonEnd() {
        return afternoonEnd;
    }

    /**
     * Sets the value of the afternoonEnd property.
     * 
     */
    public void setAfternoonEnd(int value) {
        this.afternoonEnd = value;
    }

    /**
     * Gets the value of the afternoonStart property.
     * 
     */
    public int getAfternoonStart() {
        return afternoonStart;
    }

    /**
     * Sets the value of the afternoonStart property.
     * 
     */
    public void setAfternoonStart(int value) {
        this.afternoonStart = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the morningEnd property.
     * 
     */
    public int getMorningEnd() {
        return morningEnd;
    }

    /**
     * Sets the value of the morningEnd property.
     * 
     */
    public void setMorningEnd(int value) {
        this.morningEnd = value;
    }

    /**
     * Gets the value of the morningStart property.
     * 
     */
    public int getMorningStart() {
        return morningStart;
    }

    /**
     * Sets the value of the morningStart property.
     * 
     */
    public void setMorningStart(int value) {
        this.morningStart = value;
    }

    /**
     * Gets the value of the possibleFixed property.
     * 
     */
    public boolean isPossibleFixed() {
        return possibleFixed;
    }

    /**
     * Sets the value of the possibleFixed property.
     * 
     */
    public void setPossibleFixed(boolean value) {
        this.possibleFixed = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     */
    public void setZipcode(int value) {
        this.zipcode = value;
    }

}
