package com.atguigu.springcloud.Service;

import com.atguigu.springcloud.OrderFeignHystrixMain80;
import org.springframework.stereotype.Component;


@Component
public class OrderFeignHystrixService implements OrderHystrixService {

    @Override
    public String PaymentInfo_ok(Integer id){
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String PaymentInfo_TimeOut(Integer id){
        return "-----PaymentFallbackService fall back-PaymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
