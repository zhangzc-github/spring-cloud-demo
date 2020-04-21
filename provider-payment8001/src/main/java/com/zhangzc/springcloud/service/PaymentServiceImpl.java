package com.zhangzc.springcloud.service;

import com.zhangzc.springcloud.dao.PaymentDao;
import com.zhangzc.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public Integer save(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment findById(int id) {
        return paymentDao.selectById(id);
    }
}
