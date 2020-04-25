package com.zhangzc.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    private final String INVOKE_URL = "http://payment-consul-service";
    @GetMapping("/hello")
    public String hello(){
        return restTemplate.postForObject(INVOKE_URL+"/hello", null, String.class);
    }
}
