package com.w1nd.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.w1nd.springcloud.entities.CommonResult;
import com.w1nd.springcloud.entities.Payment;

/**
 * @Description:
 * @author: w1nd
 * @date: 2021年09月30日 16:14
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义, global handlerException-------1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义, global handlerException2------2");
    }
}
