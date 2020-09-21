package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static Map<Integer,Payment> hashMap = new HashMap<>();
    static{
        hashMap.put(1,new Payment(1,"28a8c1e3bc2742d8848569891fb42181"));
        hashMap.put(2,new Payment(2,"28a8c1e3bc2742d8848569891fb42182"));
        hashMap.put(3,new Payment(3,"28a8c1e3bc2742d8848569891fb42183"));
    }

    public CommonResult<Payment> paymentSql(@PathVariable("id") Integer id){
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<>(200,"from mysql,serverPort:  "+serverPort,payment);
        return result;
        
    }
    
}
