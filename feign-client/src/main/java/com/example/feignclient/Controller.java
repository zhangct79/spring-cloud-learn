package com.example.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private CartFeignClient cartFeignClient;

    @GetMapping("/hello")
    public ResponseEntity hello(){
        String result = cartFeignClient.hello();
        return ResponseEntity.ok(result);
    }
}
