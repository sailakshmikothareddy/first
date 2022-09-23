package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World RESTful with Spring Boot";
    }  
    @RequestMapping("/hi")
    public String hello(@RequestParam(name = "name", defaultValue = "saiii") String name) {
        return "Hello " + name;
    }

}

