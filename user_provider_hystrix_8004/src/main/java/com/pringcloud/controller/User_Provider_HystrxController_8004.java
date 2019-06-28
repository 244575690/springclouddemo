package com.pringcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pringcloud.mapper.UserMapper;
import com.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/25 19:25
 * @description：
 */
@RestController
@RequestMapping("/privoder")
public class User_Provider_HystrxController_8004 {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/user")
    @HystrixCommand(fallbackMethod = "failGet")
    public User getUser(Long id) {
        if(id==2){
            throw new RuntimeException("111111");
        }
        User user = userMapper.selectById(id);
        return user;
    }

    public User failGet(Long id){
        User user = new User();
        user.setName("出异常了");
        return user;
    }
}
