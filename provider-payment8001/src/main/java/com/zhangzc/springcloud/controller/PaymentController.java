package com.zhangzc.springcloud.controller;

import com.zhangzc.springcloud.entities.CommonResult;
import com.zhangzc.springcloud.entities.Payment;
import com.zhangzc.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/add")
    public CommonResult<Integer> add(@RequestBody Payment payment){
        Integer result = paymentService.save(payment);
        if(result>=0){
            return new CommonResult<>(200,"成功",result);
        }else{
            return new CommonResult<>(400,"失败",result);
        }
    }
    @GetMapping("/payment/query/{id}")
    public CommonResult<Payment> query(@PathVariable("id") int id){
        Payment result = paymentService.findById(id);
        if (result != null){
            return new CommonResult<>(200,"成功",result);
        }else{
            return new CommonResult<>(400,"失败",result);
        }
    }
}
