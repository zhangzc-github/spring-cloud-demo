package com.zhangzc.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("/payment/query/{id}")
    public String query(@PathVariable("id") Integer id){
        int a = 10/0;
        return "ok:"+id;
    }
    public String error(Integer id){
        return "error:"+id;
    }
}
