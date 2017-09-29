
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
 *         &lt;element name="rendelesReturn" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
@XmlRootElement(name = "rendelesResponse", namespace = "http://netlife.hu/g4futar/webservice/")
public class RendelesResponse {

    @XmlElement(required = true)
    protected Object rendelesReturn;

    /**
     * Gets the value of the rendelesReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRendelesReturn() {
        return rendelesReturn;
    }

    /**
     * Sets the value of the rendelesReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRendelesReturn(Object value) {
        this.rendelesReturn = value;
    }

}
