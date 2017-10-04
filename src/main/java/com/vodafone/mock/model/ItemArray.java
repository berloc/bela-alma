package com.vodafone.mock.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemArray", namespace = "http://expectedtimedelivery.ws.g4s.netlife.hu/", propOrder = {
        "item"
})
public class ItemArray {

    @XmlElement(nillable = true)
    private List<StatusObject> item;

    public List<StatusObject> getItems() {
        return item;
    }

    public void setItems(List<StatusObject> item) {
        this.item = item;
    }
}
