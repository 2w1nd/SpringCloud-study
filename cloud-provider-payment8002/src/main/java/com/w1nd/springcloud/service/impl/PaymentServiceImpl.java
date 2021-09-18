package com.w1nd.springcloud.service.impl;

import com.w1nd.springcloud.dao.PaymentDao;
import com.w1nd.springcloud.entities.Payment;
import com.w1nd.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: w1nd
 * @date: 2021年09月03日 17:18
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
