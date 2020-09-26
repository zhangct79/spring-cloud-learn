package com.zhangct.service1.model;

import com.zhangct.service1.base.GenderEnum;

public class PersonModel {
    private String name;
    private Integer age;
    private GenderEnum gender;

    PersonModel() {

    }

    public PersonModel(String name, Integer age, GenderEnum gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }




}
