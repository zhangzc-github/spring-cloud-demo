package com.zhangzc.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhangzc.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/order/query/{id}")
    @HystrixCommand(fallbackMethod = "error")
    public String query(@PathVariable("id") Integer id){
        //int a = 10/0;
        return orderService.query(id);
    }
    public String error(Integer id){
        return "order error:"+id;
    }
}
