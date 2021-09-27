package com.w1nd.springcloud.service.Impl;

import com.w1nd.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;
import sun.plugin2.message.Message;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Description:
 * @author: w1nd
 * @date: 2021年09月27日 10:58
 */
@EnableBinding(Source.class) // 定义消息的推送管道
public class MessageProvider implements IMessageProvider {

    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*******serial:" + serial);
        return null;
    }
}
