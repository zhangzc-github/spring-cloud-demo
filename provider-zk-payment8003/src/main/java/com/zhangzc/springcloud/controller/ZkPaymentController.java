package com.zhangzc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZkPaymentController {
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/hello")
    public String hello(){
        return "hello:"+System.currentTimeMillis();
    }
}
