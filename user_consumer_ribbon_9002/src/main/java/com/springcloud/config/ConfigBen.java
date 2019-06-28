package com.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/19 16:20
 * @description：
 */
@Configuration
public class ConfigBen {
    @Bean
    @LoadBalanced  //开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
@Bean   //修改负载均衡的策略，默认为RoundRobinRule，轮询
    public IRule getIrule(){
//        return new RoundRobinRule();//轮询
        return new RandomRule();       //随机
    }
}
