package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.service1api.api.HelloController;

@RestController
public class Hello{
    @Autowired
    Person person;

    @Autowired
    private HelloApi helloApi ;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world\n" + person.toString();
    }

    @RequestMapping("/helloapi")
    public String helloApi() {

        return "helloApi\n" + helloApi.hello();
    }
}
