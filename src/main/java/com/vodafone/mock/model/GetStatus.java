
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
 *         &lt;element name="idArray" type="{http://netlife.hu/g4futar/webservice/}IdArray"/>
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
@XmlRootElement(name = "getStatus", namespace = "http://netlife.hu/g4futar/webservice/")
public class GetStatus {

    @XmlElement(required = true)
    protected IdArray idArray;

    /**
     * Gets the value of the idArray property.
     * 
     * @return
     *     possible object is
     *     {@link IdArray }
     *     
     */
    public IdArray getIdArray() {
        return idArray;
    }

    /**
     * Sets the value of the idArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdArray }
     *     
     */
    public void setIdArray(IdArray value) {
        this.idArray = value;
    }

}
