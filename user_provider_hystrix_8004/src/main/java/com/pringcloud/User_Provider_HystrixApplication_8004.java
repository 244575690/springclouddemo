package com.pringcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/25 19:22
 * @description：
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@MapperScan("com.pringcloud.mapper")
public class User_Provider_HystrixApplication_8004 {
    public static void main(String[] args) {
        SpringApplication.run(User_Provider_HystrixApplication_8004.class,args);
    }
}
