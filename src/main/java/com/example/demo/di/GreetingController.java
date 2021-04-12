package com.example.demo.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/greeting")
@RestController
public class GreetingController {


    private final GreetingApi greetingApi;

    @Autowired //wstrzykiwanie zależności do konstruktora
    public GreetingController(@Qualifier("polishGreetingApi") GreetingApi greetingApi) {
        this.greetingApi = greetingApi;
    }

    @GetMapping
    public String greetings(){
        return greetingApi.greetings();
    }
}
