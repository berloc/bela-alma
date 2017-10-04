package com.vodafone.mock.endpoint;

import com.vodafone.mock.model.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class GetStatusEndpoint extends AbstractEndpoint{

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStatus")
    @ResponsePayload
    public GetStatusResponse getStatus(@RequestPayload GetStatus request) {

        GetStatusResponse response = factory.createGetStatusResponse();

        StatusObject statusObject = factory.createStatusObject();
        StatusObject statusObject2 = factory.createStatusObject();
        statusObject.setId(1);
        statusObject.setStatus("20");
        statusObject2.setId(2);
        statusObject2.setStatus("5");
        List<StatusObject> statusList = new ArrayList<>();
        statusList.add(statusObject);
        statusList.add(statusObject2);
        
        ItemArray itemArray = new ItemArray();
        itemArray.setItems(statusList);

        response.setStatus(itemArray);

        return response;
    }
}
