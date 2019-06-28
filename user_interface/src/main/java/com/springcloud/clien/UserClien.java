package com.springcloud.clien;

import com.springcloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/20 14:55
 * @description：这个接口是用于feign做负载均衡时
 */
@FeignClient(value = "USER-PROVIDER",fallbackFactory = UserClientHystrixFallbackFactory.class) //服务提供者的名称
@RequestMapping("/privoder")
public interface UserClien {
    @RequestMapping("/user")
    User getUser(@RequestParam("id") Long id);
/*
    @RequestMapping("/user/{id}")
    User getUser(@PathVariable("id") Long id);
*/
}
