package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/27 17:10
 * @description：
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_GatwayApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_GatwayApplication_9527.class,args);
    }
}
