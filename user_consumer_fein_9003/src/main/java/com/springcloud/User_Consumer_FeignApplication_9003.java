package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/20 14:48
 * @description：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.springcloud") //扫描接口所在的包
public class User_Consumer_FeignApplication_9003 {
    public static void main(String[] args) {
        SpringApplication.run(User_Consumer_FeignApplication_9003.class,args);
    }
}
