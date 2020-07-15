package com.atguigu.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * [用一句话描述此类]
 *
 * @author: liuzx
 * @create: 2020-07-09 18:04
 **/
@SpringBootApplication
@EnableDiscoveryClient      //该注解用于向使用consul或者zookeeper作为注册中心shi注册服务
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
