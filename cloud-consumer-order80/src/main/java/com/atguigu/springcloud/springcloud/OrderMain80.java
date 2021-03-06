package com.atguigu.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * [消费者订单模块]
 *
 * @author: liuzx
 * @create: 2020-07-06 09:42
 **/
@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args){
        //SpringBootApplication.run(OrderMain80.class,args);
        SpringApplication.run(OrderMain80.class,args);
    }
}
