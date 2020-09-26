package com.example.service2.controller;

import com.example.service2.base.GenderEnum;
import com.example.service2.model.PersonModel;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EurekaServiceInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class IndexController {

    @Value("${server.port}")
    String port;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Qualifier("eurekaClient")
    @Autowired
    EurekaClient eurekaClient;


    @Autowired
    DiscoveryClient client;


    @RequestMapping("hello")
    public String hello() {
        return "hello:"+port;
    }

    @RequestMapping("/home")
    public String home() {

//        System.out.println("=========================");
//        List<ServiceInstance> services = client.getInstances("service1");
//        for (ServiceInstance instance1:services) {
//            System.out.println(instance1.getHost()+":"+instance1.getPort());
//        }

        System.out.println(loadBalancerClient.choose("service1").getPort());

        return this.restTemplate.getForObject("http://service1/hello/", String.class);
    }

    @RequestMapping("/persons")
    public PersonModel persons() {
        PersonModel personModel = this.restTemplate.getForObject("http://service1/persons/", PersonModel.class);
        personModel.setGender(GenderEnum.ADNROGYNE);
        return personModel;
    }
}
