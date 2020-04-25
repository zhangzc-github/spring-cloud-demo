package com.zhangzc.springcloud.dao;

import com.zhangzc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    int insert(Payment payment);
    Payment selectById(@Param("id") int id);
}
