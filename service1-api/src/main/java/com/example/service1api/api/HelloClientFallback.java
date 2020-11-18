package com.example.service1api.api;

public class HelloClientFallback implements HelloController {
    @Override
    public String hello() {
        return "fallback hello";
    }
}
