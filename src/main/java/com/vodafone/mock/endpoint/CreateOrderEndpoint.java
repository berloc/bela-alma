package com.vodafone.mock.endpoint;

import com.vodafone.mock.model.Rendeles;
import com.vodafone.mock.model.RendelesReturn;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;

@Endpoint
public class CreateOrderEndpoint extends AbstractEndpoint {

    public static Boolean ISVALID = true;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "rendeles")
    @ResponsePayload
    public JAXBElement<RendelesReturn> createOrder(@RequestPayload Rendeles request) {


        RendelesReturn response = new RendelesReturn();

        if (ISVALID) {
            response.setFuvarlevel("fuvarlevél pdf-ben");
            response.setG4SOrderID(23);
            response.setAck("success");
        } else {
            response.setAck("Unknown error");
            response.setHiba("Non-recognized action parameter...? Call Borsi!");
        }
        return factory.createRendelesReturn(response);
    }
}
