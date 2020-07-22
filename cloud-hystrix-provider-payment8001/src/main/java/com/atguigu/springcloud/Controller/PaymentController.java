package com.atguigu.springcloud.Controller;

import com.atguigu.springcloud.Service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;


@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String PaymentInfo_ok(@PathVariable("id") Integer id){
        return paymentHystrixService.PaymentInfo_ok(id);
    }

    @GetMapping(value = "/payment/hystrix/timeOut/{id}")
    public String PaymentInfo_TimeOut(@PathVariable("id") Integer id){
        return paymentHystrixService.PaymentInfo_TimeOut(id);
    }

    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentCircuitBreaker(id);
    }
}
