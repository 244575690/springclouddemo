package com.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/19 10:16
 * @description：消费者直接调用提供者，没有通过注册中心
 */
@Configuration
public class ConfigBean {
    @Bean//此标注表示将RestTemplate交给Spring管理
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
