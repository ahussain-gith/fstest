package com.ics.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexEndpoint {
    @GetMapping(path = "/")
    public String index(){
        return "Spring Boot Application";
    }
}
