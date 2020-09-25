package com.example.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Value("${server.port}")
    String port;
    @RequestMapping("hello")
    public String hello() {
        return "hello:"+port;
    }

    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/home")
    public String home() {
        return this.restTemplate.getForObject("http://service1/hello/", String.class);

    }
}
