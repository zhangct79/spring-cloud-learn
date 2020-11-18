package com.example.service1api.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SERVICE1", fallback = HelloClientFallback.class)
public interface HelloController {
    @GetMapping("/hello")
    public String hello();
}
