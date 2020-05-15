package com.zhangzc.springcloud.controller;

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
    public String query(@PathVariable("id") Integer id){
        return orderService.query(id);
    }
}
