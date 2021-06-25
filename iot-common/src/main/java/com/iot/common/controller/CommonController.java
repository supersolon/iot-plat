package com.iot.common.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonController {

//    private String name = "zhangsan";
//    private String age = "18";

    //引入@RefreshScope注解，值从配置文件获取
    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private String age;

    @RequestMapping("/index")
    public String login(){

        String msg =" I am " + name + " , I am " + age + " years old!";
        System.out.println(msg);
        return msg;
    }
}
