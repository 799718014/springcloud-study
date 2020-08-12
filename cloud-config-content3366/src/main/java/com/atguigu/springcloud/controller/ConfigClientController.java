package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * [用一句话描述此类]
 *
 * @author: liuzx
 * @create: 2020-08-12 11:36
 **/
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String serverPost;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return "server.port:"+serverPost+"/n configInfo:"+configInfo;
    }
}
