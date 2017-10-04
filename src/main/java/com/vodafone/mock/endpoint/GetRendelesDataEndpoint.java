package com.vodafone.mock.endpoint;

import com.vodafone.mock.model.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;

@Endpoint
public class GetRendelesDataEndpoint extends AbstractEndpoint {

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getRendelesData")
    @ResponsePayload
    public GetRendelesDataResponse getRendelesData(@RequestPayload GetRendelesData request){
        System.out.println(request.getG4SOrderID());
        GetRendelesDataResponse response = new GetRendelesDataResponse();
        response.setTipus(1);
        response.setFutarnalBankkartyaFizetes(false);
        response.setAzonnaliSzallitas(false);
        response.setFixIdejuRendeles(null);
        response.setStatus(4);

//      TODO!
//      time!

//      TODO!
//      rendelesAdatok!
        SzallitasiAdatok szallitasiAdatok = new SzallitasiAdatok();
        szallitasiAdatok.setCVevokod("bela");

        return response;
    }
}
