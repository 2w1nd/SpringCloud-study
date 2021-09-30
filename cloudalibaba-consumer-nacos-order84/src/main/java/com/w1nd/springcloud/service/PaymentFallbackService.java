package com.w1nd.springcloud.service;

import com.w1nd.springcloud.entities.CommonResult;
import com.w1nd.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: w1nd
 * @date: 2021年09月30日 17:06
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}