package com.atguigu.springcloud.alibab.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){

        return "-------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        log.info( "线程池："+Thread.currentThread().getName()+"PaymentInfo_ok,id");
        return "-------testB";
    }
}
