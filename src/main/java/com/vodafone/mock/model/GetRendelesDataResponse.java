package com.vodafone.mock.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "getRendelesDataResponse", namespace = "http://netlife.hu/g4futar/webservice/")
@XmlSeeAlso(ArrayList.class)
public class GetRendelesDataResponse extends Rendeles {

    @XmlElement(required = true)
    private RendelesAdatok rendelesAdatok;
//    @XmlElement(required = true)
    private java.lang.String realDeliveryTime;


    public RendelesAdatok getRendelesAdatok() {
        return rendelesAdatok;
    }

    public void setRendelesAdatok(RendelesAdatok rendelesAdatok) {
        this.rendelesAdatok = rendelesAdatok;
    }

    public java.lang.String getRealDeliveryTime() {
        return realDeliveryTime;
    }

    public void setRealDeliveryTime(java.lang.String realDeliveryTime) {
        this.realDeliveryTime = realDeliveryTime;
    }
}
