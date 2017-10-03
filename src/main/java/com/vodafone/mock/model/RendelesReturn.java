
package com.vodafone.mock.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createRendelesReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createRendelesReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ack" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hiba" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fuvarlevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="G4SOrderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rendelesReturn", namespace = "http://netlife.hu/g4futar/webservice/", propOrder = {

})
public class RendelesReturn {

    @XmlElement(required = true)
    protected java.lang.String ack;
    @XmlElement(required = true)
    protected java.lang.String hiba;
    protected java.lang.String fuvarlevel;
    @XmlElement(name = "G4SOrderID")
    protected java.lang.Integer g4SOrderID;

    /**
     * Gets the value of the ack property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAck() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAck(java.lang.String value) {
        this.ack = value;
    }

    /**
     * Gets the value of the hiba property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getHiba() {
        return hiba;
    }

    /**
     * Sets the value of the hiba property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setHiba(java.lang.String value) {
        this.hiba = value;
    }

    /**
     * Gets the value of the fuvarlevel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFuvarlevel() {
        return fuvarlevel;
    }

    /**
     * Sets the value of the fuvarlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFuvarlevel(java.lang.String value) {
        this.fuvarlevel = value;
    }

    /**
     * Gets the value of the g4SOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Integer }
     *     
     */
    public java.lang.Integer getG4SOrderID() {
        return g4SOrderID;
    }

    /**
     * Sets the value of the g4SOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Integer }
     *     
     */
    public void setG4SOrderID(java.lang.Integer value) {
        this.g4SOrderID = value;
    }

}
