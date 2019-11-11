package com.frank.dubbo.practice.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.frank.dubbo.practice.service.ConsumerService;
import com.frank.dubbo.practice.service.UserService;
import com.frank.dubbo.entity.po.User;

@Service
public class ConsumerServiceImpl implements ConsumerService{

    @Reference(version = "userService")
    private UserService userService;

    @Override
    public User testDubbo() {
        User user = userService.helloDubbo("service层的调用者");
        return user;
    }
}
