package com.vodafone.mock.endpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/")
    public String startApp(){
        return "index";
    }
}
