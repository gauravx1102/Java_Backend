package com.fulara.springbootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping(path = "/home")
    public String hellocontroller(){
        return "Hello, I am Gaurav Fulara";
    }
    @GetMapping(path = "/user")
    public String users(){
        return "Hi this is your user";
    }
}
