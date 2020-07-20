package com.atguigu.springcloud.Service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT" ,fallback = OrderFeignHystrixService.class)
public interface OrderHystrixService {

    @GetMapping(value = "/payment/hystrix/ok/{id}")
    public String PaymentInfo_ok(@PathVariable("id") Integer id);

    @GetMapping(value = "/payment/hystrix/timeOut/{id}")
    public String PaymentInfo_TimeOut(@PathVariable("id") Integer id);
}
