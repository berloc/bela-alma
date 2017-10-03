
package com.vodafone.mock.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;


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
 *         &lt;element name="G4SOrderIDk" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
@XmlRootElement(name = "napiZarasResponse", namespace = "http://netlife.hu/g4futar/webservice/")
@XmlSeeAlso(ArrayList.class)
public class NapiZarasResponse {

    @XmlElement(name = "G4SOrderIDk", required = true)
    protected Object g4SOrderIDk;

    /**
     * Gets the value of the g4SOrderIDk property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getG4SOrderIDk() {
        return g4SOrderIDk;
    }

    /**
     * Sets the value of the g4SOrderIDk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setG4SOrderIDk(Object value) {
        this.g4SOrderIDk = value;
    }

}
