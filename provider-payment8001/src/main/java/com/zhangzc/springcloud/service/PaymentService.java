package com.zhangzc.springcloud.service;

import com.zhangzc.springcloud.entities.Payment;

public interface PaymentService {
    Integer save(Payment payment);
    Payment findById(int id);
}
