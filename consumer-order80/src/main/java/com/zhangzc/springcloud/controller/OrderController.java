package com.zhangzc.springcloud.controller;

import com.zhangzc.springcloud.entities.CommonResult;
import com.zhangzc.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private final String PAY_URL = "http://PAYMENT-SERVICE";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/add")
    public CommonResult<Integer> add(Payment payment) {
        return restTemplate.postForObject(PAY_URL + "/payment/add", payment, CommonResult.class);
    }
    @GetMapping("/order/query/{id}")
    public CommonResult<Payment> query(@PathVariable("id") int id) {
        return restTemplate.getForObject(PAY_URL + "/payment/query/" + id, CommonResult.class);
    }
}
