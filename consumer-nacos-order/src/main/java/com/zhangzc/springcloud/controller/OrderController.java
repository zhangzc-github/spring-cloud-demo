package com.zhangzc.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${rpc.uri}")
    private String host_uri;
    @GetMapping("/order/query/{id}")
    public String query(@PathVariable("id")Integer id){
        return restTemplate.getForObject(host_uri + "/payment/query/" + id, String.class);
    }
}
