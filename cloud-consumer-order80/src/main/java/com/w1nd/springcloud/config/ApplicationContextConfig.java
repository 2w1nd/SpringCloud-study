package com.w1nd.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @author: w1nd
 * @date: 2021年09月07日 12:03
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced // 负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}

