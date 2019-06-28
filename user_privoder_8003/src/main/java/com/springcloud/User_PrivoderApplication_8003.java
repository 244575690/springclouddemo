package com.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/20 15:11
 * @description：
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.springcloud.mapper")
public class User_PrivoderApplication_8003 {
    public static void main(String[] args) {
        SpringApplication.run(User_PrivoderApplication_8003.class,args);
    }
}
