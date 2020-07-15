package com.atguigu.springcloud.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * [用一句话描述此类]
 *
 * @author: liuzx
 * @create: 2020-07-09 18:10
 **/
public class OrderZKController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;
    
    @GetMapping("/consumer/payment/zk")
    public  String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"payment/zk",String.class);
        return result;
    }
}
