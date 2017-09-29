
package com.vodafone.mock.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SzallitasiAdatok complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SzallitasiAdatok">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="c_nev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="c_szemely" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="c_irsz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="c_helyseg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="c_utca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="c_telefon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="c_email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="c_vevokod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="szamlaszam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="utanvetel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="darab" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="suly" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tartalom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instrukcio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="feladobetujel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="helyszin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SzallitasiAdatok", namespace = "http://netlife.hu/g4futar/webservice/", propOrder = {

})
public class SzallitasiAdatok {

    @XmlElement(name = "c_nev", required = true)
    protected java.lang.String cNev;
    @XmlElement(name = "c_szemely", required = true)
    protected java.lang.String cSzemely;
    @XmlElement(name = "c_irsz", required = true)
    protected java.lang.String cIrsz;
    @XmlElement(name = "c_helyseg", required = true)
    protected java.lang.String cHelyseg;
    @XmlElement(name = "c_utca", required = true)
    protected java.lang.String cUtca;
    @XmlElement(name = "c_telefon", required = true)
    protected java.lang.String cTelefon;
    @XmlElement(name = "c_email", required = true)
    protected java.lang.String cEmail;
    @XmlElement(name = "c_vevokod", required = true)
    protected java.lang.String cVevokod;
    @XmlElement(required = true)
    protected java.lang.String szamlaszam;
    @XmlElement(required = true)
    protected java.lang.String utanvetel;
    protected int darab;
    @XmlElement(required = true)
    protected java.lang.String suly;
    @XmlElement(required = true)
    protected java.lang.String tartalom;
    @XmlElement(required = true)
    protected java.lang.String instrukcio;
    @XmlElement(required = true)
    protected java.lang.String feladobetujel;
    protected int helyszin;

    /**
     * Gets the value of the cNev property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCNev() {
        return cNev;
    }

    /**
     * Sets the value of the cNev property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCNev(java.lang.String value) {
        this.cNev = value;
    }

    /**
     * Gets the value of the cSzemely property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCSzemely() {
        return cSzemely;
    }

    /**
     * Sets the value of the cSzemely property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCSzemely(java.lang.String value) {
        this.cSzemely = value;
    }

    /**
     * Gets the value of the cIrsz property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCIrsz() {
        return cIrsz;
    }

    /**
     * Sets the value of the cIrsz property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCIrsz(java.lang.String value) {
        this.cIrsz = value;
    }

    /**
     * Gets the value of the cHelyseg property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCHelyseg() {
        return cHelyseg;
    }

    /**
     * Sets the value of the cHelyseg property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCHelyseg(java.lang.String value) {
        this.cHelyseg = value;
    }

    /**
     * Gets the value of the cUtca property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCUtca() {
        return cUtca;
    }

    /**
     * Sets the value of the cUtca property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCUtca(java.lang.String value) {
        this.cUtca = value;
    }

    /**
     * Gets the value of the cTelefon property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCTelefon() {
        return cTelefon;
    }

    /**
     * Sets the value of the cTelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCTelefon(java.lang.String value) {
        this.cTelefon = value;
    }

    /**
     * Gets the value of the cEmail property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCEmail() {
        return cEmail;
    }

    /**
     * Sets the value of the cEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCEmail(java.lang.String value) {
        this.cEmail = value;
    }

    /**
     * Gets the value of the cVevokod property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCVevokod() {
        return cVevokod;
    }

    /**
     * Sets the value of the cVevokod property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCVevokod(java.lang.String value) {
        this.cVevokod = value;
    }

    /**
     * Gets the value of the szamlaszam property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSzamlaszam() {
        return szamlaszam;
    }

    /**
     * Sets the value of the szamlaszam property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSzamlaszam(java.lang.String value) {
        this.szamlaszam = value;
    }

    /**
     * Gets the value of the utanvetel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getUtanvetel() {
        return utanvetel;
    }

    /**
     * Sets the value of the utanvetel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUtanvetel(java.lang.String value) {
        this.utanvetel = value;
    }

    /**
     * Gets the value of the darab property.
     * 
     */
    public int getDarab() {
        return darab;
    }

    /**
     * Sets the value of the darab property.
     * 
     */
    public void setDarab(int value) {
        this.darab = value;
    }

    /**
     * Gets the value of the suly property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSuly() {
        return suly;
    }

    /**
     * Sets the value of the suly property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSuly(java.lang.String value) {
        this.suly = value;
    }

    /**
     * Gets the value of the tartalom property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTartalom() {
        return tartalom;
    }

    /**
     * Sets the value of the tartalom property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTartalom(java.lang.String value) {
        this.tartalom = value;
    }

    /**
     * Gets the value of the instrukcio property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getInstrukcio() {
        return instrukcio;
    }

    /**
     * Sets the value of the instrukcio property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setInstrukcio(java.lang.String value) {
        this.instrukcio = value;
    }

    /**
     * Gets the value of the feladobetujel property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFeladobetujel() {
        return feladobetujel;
    }

    /**
     * Sets the value of the feladobetujel property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFeladobetujel(java.lang.String value) {
        this.feladobetujel = value;
    }

    /**
     * Gets the value of the helyszin property.
     * 
     */
    public int getHelyszin() {
        return helyszin;
    }

    /**
     * Sets the value of the helyszin property.
     * 
     */
    public void setHelyszin(int value) {
        this.helyszin = value;
    }

}
