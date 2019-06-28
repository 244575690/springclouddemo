package com.springcloud.controller;

import com.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/19 10:15
 * @description：
 */
@RestController
@RequestMapping("/consumer")
public class User_ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/getUser")
    public User getUser(Long id){
        //不通过注册中心，两个服务之间直接进行远程调用
        String url = "http://localhost:8001/privoder/user?id="+id;
        return restTemplate.getForObject(url,User.class);
//        return new User();
    }


}
