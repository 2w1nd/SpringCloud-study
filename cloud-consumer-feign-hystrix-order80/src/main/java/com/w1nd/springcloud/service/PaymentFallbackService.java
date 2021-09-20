package com.w1nd.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: w1nd
 * @date: 2021年09月20日 14:58
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----------PaymentFallbackService fall back paymentInfo_OK, /(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "---------------PaymentFallbackService fall back paymentInfo_TimeOut, /(ㄒoㄒ)/~~";
    }
}
