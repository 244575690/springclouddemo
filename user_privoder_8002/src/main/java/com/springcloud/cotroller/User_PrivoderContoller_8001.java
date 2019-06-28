package com.springcloud.cotroller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.springcloud.mapper.UserMapper;
import com.springcloud.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/18 15:56
 * @description：
 */
@RestController
@RequestMapping("/privoder")
@MapperScan("com.springcloud.mapper/*")
public class User_PrivoderContoller_8001 {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/user")
    public User getUser(Long id){
        User user = userMapper.selectById(id);
        user.setName(user.getName()+"8002");
        return user;
    }

    @RequestMapping("/adduser")
    public void addUser(User user){
        userMapper.insert(user);

    }
    @RequestMapping("/getUsersList")
    public List<User> getUsersList(Integer age, String name){
//        userMapper.insert(user);
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.ge("age",age).likeRight("name",name);
        List<User> users = userMapper.selectList(wrapper);
        return users;

    }
}
