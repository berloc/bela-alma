package com.vodafone.mock.endpoint;

import com.vodafone.mock.model.StatusResponse;
import com.vodafone.mock.model.ToggleRequest;
import com.vodafone.mock.model.ToggleResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ToggleController {

    @ResponseBody
    @PostMapping("/toggle")
    public ToggleResponse toggle(@RequestBody ToggleRequest request){
        CreateOrderEndpoint.ISVALID = request.getValid();
        return new ToggleResponse();
    }

    @ResponseBody
    @GetMapping("/current")
    public StatusResponse current(){
        return new StatusResponse(CreateOrderEndpoint.ISVALID);
    }

}
