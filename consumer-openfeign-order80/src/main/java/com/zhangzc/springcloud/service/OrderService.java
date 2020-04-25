package com.zhangzc.springcloud.service;

import com.zhangzc.springcloud.entities.CommonResult;
import com.zhangzc.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(value = "PAYMENT-SERVICE")
public interface OrderService {

    @PostMapping("/payment/add")
    CommonResult<Integer> add(@RequestBody Payment payment);
    @GetMapping("/payment/query/{id}")
    CommonResult<Payment> query(@PathVariable("id") int id);
}
