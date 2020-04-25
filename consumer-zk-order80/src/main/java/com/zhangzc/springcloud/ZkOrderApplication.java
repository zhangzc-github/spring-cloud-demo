package com.zhangzc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZkOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZkOrderApplication.class, args);
    }
}
