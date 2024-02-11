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
    //can i use getmapping inside any given address
    @GetMapping(path = "/home/gaurav")      //mapping ke andar mapping
    public String gaurav(){
        return "This is Gaurav's address";
    }
}
