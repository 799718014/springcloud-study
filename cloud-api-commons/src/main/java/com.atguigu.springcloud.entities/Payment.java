package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * [用一句话描述此类]
 *
 * @author: liuzx
 * @create: 2020-07-02 17:13
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private int id;
    private String serial;
}
