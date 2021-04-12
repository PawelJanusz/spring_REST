package com.example.demo.di;

import org.springframework.stereotype.Component;

@Component
public class EnglishGreetingController implements GreetingApi{

    @Override
    public String greetings() {
        return "Good morning";
    }
}
