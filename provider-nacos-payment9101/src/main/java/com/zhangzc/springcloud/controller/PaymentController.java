package com.zhangzc.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/query/{id}")
    public String query(@PathVariable("id") Integer id) {
        return "port:"+port+" id:"+id;
    }
}
