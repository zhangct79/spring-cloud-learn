package com.example.service2.model;


import com.example.service2.base.GenderEnum;

public class PersonModel {
    private String name;
    private Integer age;
    private GenderEnum gender;
    private Integer salary;

    PersonModel() {

    }

    public PersonModel(String name, Integer age, GenderEnum gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public PersonModel(String name, Integer age, GenderEnum gender, Integer salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
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
