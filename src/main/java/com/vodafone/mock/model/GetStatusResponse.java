
package com.vodafone.mock.model;

import javax.xml.bind.annotation.*;
import java.util.List;


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
 *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
@XmlRootElement(name = "getStatusResponse", namespace = "http://netlife.hu/g4futar/webservice/")
public class GetStatusResponse {

    @XmlElement(required = true)
    protected List<StatusObject> status;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public List<StatusObject> getStatus() {
        return status;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStatus(List<StatusObject> value) {
        this.status = value;
    }

}
