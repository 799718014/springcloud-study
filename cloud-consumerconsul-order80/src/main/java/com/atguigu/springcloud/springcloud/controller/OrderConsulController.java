package com.atguigu.springcloud.springcloud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * [用一句话描述此类]
 *
 * @author: liuzx
 * @create: 2020-07-13 11:13
 **/
@RestController
public class OrderConsulController {
    private static final String INVOKE_URL = "http://CONSUL-PROVIDER-PAYMENT";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"payment/consul",String.class);
        return result;
    }
}
