package com.zhangzc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HystrixOrderAppcation {
    public static void main(String[] args) {
        SpringApplication.run(HystrixOrderAppcation.class, args);
    }
}
