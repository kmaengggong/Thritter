package com.kmaengggong.thritter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value="/api/hello", method= RequestMethod.GET)
    public String test(){
        return "Hello React from Spring!";
    }
}
