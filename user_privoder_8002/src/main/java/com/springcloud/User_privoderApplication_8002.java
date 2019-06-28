package com.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/18 15:53
 * @description：
 */
@SpringBootApplication
@EnableEurekaClient //标识这是一个客户端
@MapperScan("com.springcloud.mapper")
public class User_privoderApplication_8002 {
    public static void main(String[] args) {
        SpringApplication.run(User_privoderApplication_8002.class,args);
    }
}
