package com.atguigu.springcloud.Service;


import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentHystrixService {


    public String PaymentInfo_ok(Integer id){
        return "线程池："+Thread.currentThread().getName()+"PaymentInfo_ok,id:"+id+"\t"+"haha";
    }

    public String PaymentInfo_TimeOut(Integer id){
        try { TimeUnit.MILLISECONDS.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池："+Thread.currentThread().getName()+"PaymentInfo_TimeOut,id:"+id+"\t"+"  耗时(秒): ";
    }

}
