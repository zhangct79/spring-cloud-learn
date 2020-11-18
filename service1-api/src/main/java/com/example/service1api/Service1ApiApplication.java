package com.example.service1api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker
public class Service1ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Service1ApiApplication.class, args);
    }

}
