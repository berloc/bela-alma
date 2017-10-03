package com.vodafone.mock.endpoint;

import com.vodafone.mock.model.GetStatus;
import com.vodafone.mock.model.GetStatusResponse;
import com.vodafone.mock.model.StatusObject;
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

        GetStatusResponse response = new GetStatusResponse();

        StatusObject statusObject = new StatusObject();
        StatusObject statusObject2 = new StatusObject();
        statusObject.setId(1);
        statusObject.setStatus("alma");
        statusObject2.setId(3);
        statusObject2.setStatus("kiskutyafasza");
        List<StatusObject> statusList = new ArrayList<>();
        statusList.add(statusObject);
        statusList.add(statusObject2);
        response.setStatus(statusList);

        return response;
    }
}
