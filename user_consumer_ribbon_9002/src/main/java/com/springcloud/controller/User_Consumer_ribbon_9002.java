package com.springcloud.controller;

import com.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/19 16:24
 * @description：
 */
@RestController
@RequestMapping("/ribbon")
public class User_Consumer_ribbon_9002 {
    static final  String URL = "http://USER-PROVIDER/";
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/user")
    public User getUser(Long id){
        String str = URL+"privoder/user?id="+id;
        return restTemplate.getForObject(str,User.class);
    }
}
