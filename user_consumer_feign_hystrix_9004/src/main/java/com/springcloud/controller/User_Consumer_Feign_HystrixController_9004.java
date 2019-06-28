package com.springcloud.controller;

import com.springcloud.clien.UserClien;

import com.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/26 11:45
 * @description：
 */
@RestController
@RequestMapping("/feign/hystrix")
public class User_Consumer_Feign_HystrixController_9004 {
    @Autowired
    private UserClien userClien;

    @RequestMapping("/getUser")
    public User getUser(@RequestParam("id") Long id){
        User user = userClien.getUser(id);
        return user;
    }
/*
    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Long id){
        User user = userClien.getUser(id);
        return user;
    }
*/

}
