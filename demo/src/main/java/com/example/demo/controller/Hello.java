package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world\n" + person.toString();
    }
}
