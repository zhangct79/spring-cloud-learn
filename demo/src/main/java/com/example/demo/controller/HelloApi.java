package com.example.demo.controller;

import com.example.service1api.api.HelloController;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "SERVICE1")
public interface HelloApi extends HelloController {
}
