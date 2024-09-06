package com.luv2code.springbootdemo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${custom.team}")
    private String name;

    //expose '/' that return "Hello World"
    @GetMapping("/fortune")
    public String sayHello(){
        return name;
    }
}
