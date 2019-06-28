package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/26 11:41
 * @description：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.springcloud") //扫描接口所在的包
public class User_Consumer_Feign_HytrixApplication_9004 {
    public static void main(String[] args) {
        SpringApplication.run(User_Consumer_Feign_HytrixApplication_9004.class,args);
    }
}
