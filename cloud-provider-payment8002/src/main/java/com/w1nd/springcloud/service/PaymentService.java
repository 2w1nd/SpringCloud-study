package com.w1nd.springcloud.service;

import com.w1nd.springcloud.entities.Payment;

/**
 * @Description:
 * @author: w1nd
 * @date: 2021年09月03日 17:17
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
