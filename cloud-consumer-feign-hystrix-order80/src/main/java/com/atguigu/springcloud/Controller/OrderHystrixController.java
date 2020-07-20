package com.atguigu.springcloud.Controller;

import com.atguigu.springcloud.Service.OrderFeignHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderHystrixController {

    @Resource
    private OrderFeignHystrixService orderFeignHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String PaymentInfo_ok(@PathVariable("id") Integer id){
        return orderFeignHystrixService.PaymentInfo_ok(id);
    }

    @GetMapping(value = "/consumer/payment/hystrix/timeOut/{id}")
    public String PaymentInfo_TimeOut(@PathVariable("id") Integer id){
        return orderFeignHystrixService.PaymentInfo_TimeOut(id);
    }

}
