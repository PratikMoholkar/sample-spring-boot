package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @Value("${secret.value}")
    private String secret;

    @RequestMapping(value="/demo",method=RequestMethod.GET)
    public String demoMethod() {
		System.out.println("Hello Demo");
        return "Hey this is new commit # 3";
    }
    
    
}
