package com.w1nd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @author: w1nd
 * @date: 2021年09月18日 16:29
 */
@SpringBootApplication
@EnableDiscoveryClient  // 该注解用于向使用consul或者zookepper作为注册中心时注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
