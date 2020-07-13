package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * [用一句话描述此类]
 *
 * @author: liuzx
 * @create: 2020-07-13 11:10
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced   //开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
