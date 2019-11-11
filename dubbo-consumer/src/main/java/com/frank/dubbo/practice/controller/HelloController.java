package com.frank.dubbo.practice.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.frank.dubbo.practice.service.ConsumerService;
import com.frank.dubbo.practice.service.UserService;
import com.frank.dubbo.entity.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ConsumerService consumerService;

    @Reference(version = "userService")
    private UserService userService;

    @RequestMapping("/hello")
    public String hello() {
        User user = consumerService.testDubbo();
        System.out.println(user.toString());
        User user2 = userService.helloDubbo("I am a consumer from controller");
        System.out.println(user2.toString());
        return user.toString() + user2.toString();
    }
}