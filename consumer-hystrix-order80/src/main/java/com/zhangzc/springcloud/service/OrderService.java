package com.zhangzc.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "PAYMENT-HYSTRIX-SERVICE")
public interface OrderService {
    @GetMapping("/payment/query/{id}")
    String query(@PathVariable("id") Integer id);
}
