package com.w1nd.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: w1nd
 * @date: 2021年09月03日 16:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T   Data;
    // 这个信息类的实体属性

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
