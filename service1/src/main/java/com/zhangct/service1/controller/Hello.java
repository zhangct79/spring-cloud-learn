package com.zhangct.service1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Value("${server.port}")
    String port;
    @RequestMapping("hello")
    public String hello() {
        return "hello:"+port;
    }
}
