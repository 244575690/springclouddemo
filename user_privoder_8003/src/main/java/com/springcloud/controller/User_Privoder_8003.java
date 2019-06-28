package com.springcloud.controller;

import com.springcloud.clien.UserClien;
import com.springcloud.mapper.UserMapper;
import com.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/20 15:13
 * @description：
 */
@RestController
@RequestMapping("/privoder")
public class User_Privoder_8003 implements UserClien {
//    private UserClien userClien;
    @Autowired
    private UserMapper userMapper;
   /* @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id) {
        User user = userMapper.selectById(id);
        return user;
    }*/
    @RequestMapping("/user")
    public User getUser(@RequestParam("id") Long id) {
        User user = userMapper.selectById(id);
        return user;
    }
}
