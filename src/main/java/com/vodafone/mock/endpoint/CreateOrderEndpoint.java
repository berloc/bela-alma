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

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "rendeles")
    @ResponsePayload
    public JAXBElement<RendelesReturn> createOrder(@RequestPayload Rendeles request) {

        RendelesReturn response = new RendelesReturn();

        response.setFuvarlevel("fuvarlevél pdf-ben");
        response.setG4SOrderID(23);
        response.setAck("success");

        return factory.createRendelesReturn(response);
    }
}
