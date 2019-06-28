package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/19 11:38
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication_7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_7002.class,args);
    }
}
