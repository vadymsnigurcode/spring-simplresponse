package com.example.springsimplresponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/JSON", produces = "application/json")
public class RestApiController {

    @GetMapping("/US")
    public RestResponse getResponseUs() {
        var result = new RestResponse();
        result.setName("United States of America");
        return result;
    }

    @GetMapping("/IN")
    public RestResponse getResponseIn() {
        var result = new RestResponse();
        result.setName("India");
        return result;
    }

    @GetMapping("/BR")
    public RestResponse getResponseBr() {
        var result = new RestResponse();
        result.setName("Brazil");
        return result;
    }
}
