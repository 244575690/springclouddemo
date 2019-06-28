package com.springcloud.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author ：HQ
 * @date ：Created in 2019/6/18 15:03
 * @description：
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    private Date time;


    public User(Long id, String name, Integer age, String email, Date time) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.time = time;
    }

    public User() {
    }
}
