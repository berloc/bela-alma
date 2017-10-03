
package com.vodafone.mock.model;

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
 *       &lt;all>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VFHUWS-OrderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="G4SOrderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="szallitasiAdatok" type="{http://netlife.hu/g4futar/webservice/}SzallitasiAdatok"/>
 *         &lt;element name="tipus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="futarnalBankkartyaFizetes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="azonnaliSzallitas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fixIdejuRendeles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "rendeles", namespace = "http://netlife.hu/g4futar/webservice/")
public class Rendeles {

    @XmlElement(required = true)
    protected java.lang.String action;
    @XmlElement(name = "VFHUWS-OrderID", required = true)
    protected java.lang.String vfhuwsOrderID;
    @XmlElement(name = "G4SOrderID")
    protected int g4SOrderID;
    @XmlElement(required = true)
    protected SzallitasiAdatok szallitasiAdatok;
    protected int tipus;
    protected boolean futarnalBankkartyaFizetes;
    protected int status;
    protected java.lang.Boolean azonnaliSzallitas;
    protected java.lang.String fixIdejuRendeles;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setAction(java.lang.String value) {
        this.action = value;
    }

    /**
     * Gets the value of the vfhuwsOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVFHUWSOrderID() {
        return vfhuwsOrderID;
    }

    /**
     * Sets the value of the vfhuwsOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVFHUWSOrderID(java.lang.String value) {
        this.vfhuwsOrderID = value;
    }

    /**
     * Gets the value of the g4SOrderID property.
     * 
     */
    public int getG4SOrderID() {
        return g4SOrderID;
    }

    /**
     * Sets the value of the g4SOrderID property.
     * 
     */
    public void setG4SOrderID(int value) {
        this.g4SOrderID = value;
    }

    /**
     * Gets the value of the szallitasiAdatok property.
     * 
     * @return
     *     possible object is
     *     {@link SzallitasiAdatok }
     *     
     */
    public SzallitasiAdatok getSzallitasiAdatok() {
        return szallitasiAdatok;
    }

    /**
     * Sets the value of the szallitasiAdatok property.
     * 
     * @param value
     *     allowed object is
     *     {@link SzallitasiAdatok }
     *     
     */
    public void setSzallitasiAdatok(SzallitasiAdatok value) {
        this.szallitasiAdatok = value;
    }

    /**
     * Gets the value of the tipus property.
     * 
     */
    public int getTipus() {
        return tipus;
    }

    /**
     * Sets the value of the tipus property.
     * 
     */
    public void setTipus(int value) {
        this.tipus = value;
    }

    /**
     * Gets the value of the futarnalBankkartyaFizetes property.
     * 
     */
    public boolean isFutarnalBankkartyaFizetes() {
        return futarnalBankkartyaFizetes;
    }

    /**
     * Sets the value of the futarnalBankkartyaFizetes property.
     * 
     */
    public void setFutarnalBankkartyaFizetes(boolean value) {
        this.futarnalBankkartyaFizetes = value;
    }

    /**
     * Gets the value of the item property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the item property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the azonnaliSzallitas property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isAzonnaliSzallitas() {
        return azonnaliSzallitas;
    }

    /**
     * Sets the value of the azonnaliSzallitas property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setAzonnaliSzallitas(java.lang.Boolean value) {
        this.azonnaliSzallitas = value;
    }

    /**
     * Gets the value of the fixIdejuRendeles property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFixIdejuRendeles() {
        return fixIdejuRendeles;
    }

    /**
     * Sets the value of the fixIdejuRendeles property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFixIdejuRendeles(java.lang.String value) {
        this.fixIdejuRendeles = value;
    }

}
