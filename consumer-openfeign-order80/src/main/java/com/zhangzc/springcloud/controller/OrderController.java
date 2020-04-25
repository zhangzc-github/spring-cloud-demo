package com.zhangzc.springcloud.controller;

import com.zhangzc.springcloud.entities.CommonResult;
import com.zhangzc.springcloud.entities.Payment;
import com.zhangzc.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/order/add")
    public CommonResult<Integer> add(Payment payment) {
        return orderService.add(payment);
    }
    @GetMapping("/order/query/{id}")
    public CommonResult<Payment> query(@PathVariable("id") int id) {
        return orderService.query(id);
    }
}
