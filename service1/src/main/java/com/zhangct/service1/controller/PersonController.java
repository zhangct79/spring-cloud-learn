package com.zhangct.service1.controller;


import com.zhangct.service1.base.GenderEnum;
import com.zhangct.service1.model.PersonModel;
import org.apache.http.client.methods.HttpGet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping(value = "/persons",method = RequestMethod.GET)
    public PersonModel person() {
        PersonModel personModel = new PersonModel("zhangct",41, GenderEnum.MAN);
        return personModel;
    }
}
