package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/hello")
@RestController
public class HelloWorldController {

    //localhost:8080/hello/world - path
    //@RequestMapping(method = RequestMethod.GET, value = "/hello")
    @GetMapping(value = "world")
    public String hello(){
        return "Hello Java SDA";
    }

    @GetMapping(value = "test")
    public String test(){
        return "test";
    }

    @PostMapping
    public String postExample(){
        return "post example";
    }
}
