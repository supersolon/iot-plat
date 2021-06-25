package com.iot.usercenter.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {

//    private String name = "lisi";
//    private String age = "19";

    //引入@RefreshScope注解，值从配置文件获取
    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private String age;

    //登录
    @RequestMapping("/login")
    public String login(){

        String msg =" I am " + name + " , I am " + age + " years old!";
        System.out.println(msg);
        return msg;
    }
}
