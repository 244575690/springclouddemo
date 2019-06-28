package com.springcloud.controller;

import com.springcloud.clien.UserClien;
import com.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/20 15:20
 * @description：
 */
@RestController
@RequestMapping("/consumer")
public class User_Consumer_feign_9003 {
    @Autowired
    private UserClien userClien;

    @RequestMapping("/getUser")
    public User getUser(Long id) {
        User user = userClien.getUser(id);
        return user;
    }
}
