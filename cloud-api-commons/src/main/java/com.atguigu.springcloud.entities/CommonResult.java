package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * [用一句话描述此类]
 *
 * @author: liuzx
 * @create: 2020-07-02 17:16
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 404 not_found
    private Integer code;
    private String message;
    private T      data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
