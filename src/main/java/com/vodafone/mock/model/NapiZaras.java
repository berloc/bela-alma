
package com.vodafone.mock.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="helyszinId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlRootElement(name = "napiZaras", namespace = "http://netlife.hu/g4futar/webservice/")
public class NapiZaras {

    protected int helyszinId;

    /**
     * Gets the value of the helyszinId property.
     * 
     */
    public int getHelyszinId() {
        return helyszinId;
    }

    /**
     * Sets the value of the helyszinId property.
     * 
     */
    public void setHelyszinId(int value) {
        this.helyszinId = value;
    }

}
