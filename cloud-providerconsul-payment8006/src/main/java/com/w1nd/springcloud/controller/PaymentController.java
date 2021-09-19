package com.w1nd.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description:
 * @author: w1nd
 * @date: 2021年09月19日 9:33
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentzk() {
        return "springcloud with consul" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
