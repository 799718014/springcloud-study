package com.atguigu.springcloud.Controller;

import com.atguigu.springcloud.Service.OrderFeignHystrixService;
import com.atguigu.springcloud.Service.OrderHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

    @Resource
    private OrderHystrixService orderHystrixService;

    @GetMapping(value = "/consumer/payment/hystrix/ok/{id}")
    public String PaymentInfo_ok(@PathVariable("id") Integer id){
        return orderHystrixService.PaymentInfo_ok(id);
    }

    @GetMapping(value = "/consumer/payment/hystrix/timeOut/{id}")
    /*@HystrixCommand(fallbackMethod = "PaymentInfo_TimeOutFallBackMethod", commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1500")
    })*/
   @HystrixCommand
    public String PaymentInfo_TimeOut(@PathVariable("id") Integer id){
        int age = 10/0;
        return orderHystrixService.PaymentInfo_TimeOut(id);
    }

    public String PaymentInfo_TimeOutFallBackMethod(@PathVariable("id") Integer id){
        return "我是消费者80,对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
    }

    //默认的降级方法
    public String payment_Global_FallbackMethod(){
        return "我是默认的降级方法,对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
    }
}
