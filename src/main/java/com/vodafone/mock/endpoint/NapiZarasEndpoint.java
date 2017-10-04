package com.vodafone.mock.endpoint;

import com.vodafone.mock.model.IdArray;
import com.vodafone.mock.model.NapiZaras;
import com.vodafone.mock.model.NapiZarasResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class NapiZarasEndpoint extends AbstractEndpoint {

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "napiZaras")
    @ResponsePayload
    public NapiZarasResponse napiZaras(@RequestPayload NapiZaras request){
        int locationId = request.getHelyszinId();
        IdArray responseData = factory.createIdArray();
        responseData.populateSomeStuffBasedOnLocationId(locationId);
        NapiZarasResponse response = factory.createNapiZarasResponse();
        response.setG4SOrderIDk(responseData);
        return response;
    }
}
