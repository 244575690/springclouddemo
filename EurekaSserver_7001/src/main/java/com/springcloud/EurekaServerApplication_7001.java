package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/18 11:48
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer //标识Eureka是服务端
public class EurekaServerApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_7001.class,args);
    }
}
