package com.zhangzc.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class OrderFallbackService implements OrderService{
    @Override
    public String query(Integer id) {
        return "open feign fallback:"+id;
    }
}
