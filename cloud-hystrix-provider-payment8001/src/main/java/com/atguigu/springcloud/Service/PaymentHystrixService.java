package com.atguigu.springcloud.Service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentHystrixService {


    public String PaymentInfo_ok(Integer id){
        return "线程池："+Thread.currentThread().getName()+"PaymentInfo_ok,id:"+id+"\t"+"haha";
    }

    @HystrixCommand(fallbackMethod = "PaymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="5000")
    })
    public String PaymentInfo_TimeOut(Integer id){
        try { TimeUnit.MILLISECONDS.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        //int age = 10/0;
        return "线程池："+Thread.currentThread().getName()+"PaymentInfo_TimeOut,id:"+id+"\t"+"  耗时(秒): ";
    }

    public String PaymentInfo_TimeOutHandler(Integer id){
       return "线程池："+Thread.currentThread().getName()+"PaymentInfo_TimeOut,id:"+id+"\t"+"超时了,系统繁忙或程序错误，请稍后再试";
    }
}
