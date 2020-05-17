package com.zhangzc.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DefaultProperties(defaultFallback = "default_error")
public class PaymentController {
    //@HystrixCommand(fallbackMethod = "error")
    //@HystrixCommand
    @HystrixCommand(fallbackMethod = "error",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")

    })
    @GetMapping("/payment/query/{id}")
    public String query(@PathVariable("id") Integer id){
        //int a = 10/0;
        if(id < 0) throw new RuntimeException();
        return "ok:"+id;
    }
    public String error(Integer id){
        return "error:"+id;
    }
    public String default_error(){
        return "default error";
    }
}
