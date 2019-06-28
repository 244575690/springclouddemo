package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/19 16:18
 * @description：
 */
@SpringBootApplication
@EnableEurekaClient
public class User_Consumer_ribbonApplication_9002 {
    public static void main(String[] args) {
        SpringApplication.run(User_Consumer_ribbonApplication_9002.class,args);
    }
}
