package com.example.service1api.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SERVICE1")
public interface HelloController {
    @GetMapping("/hello")
    public String hello();
}
