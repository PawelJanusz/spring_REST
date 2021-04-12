package com.example.demo.di;

import org.springframework.stereotype.Component;

@Component
public class PolishGreetingApi implements GreetingApi {

    @Override
    public String greetings() {
        return "Dzień dobry";
    }
}
