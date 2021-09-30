package com.w1nd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @author: w1nd
 * @date: 2021年09月30日 16:52
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudalibabaProviderPayment9003Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaProviderPayment9003Application.class, args);
    }

}
