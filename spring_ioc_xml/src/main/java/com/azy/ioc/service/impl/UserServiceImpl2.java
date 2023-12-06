package com.azy.ioc.service.impl;

import com.azy.ioc.service.UserService;


/*
测试init-method和destroy-method
* */
public class UserServiceImpl2 implements UserService {

    public UserServiceImpl2() {
        System.out.println("UserServiceImpl2创建了...");
    }
    public void init(){
        System.out.println("UserServiceImpl2初始化");
    }

    public void destroy(){
        System.out.println("UserServiceImpl2销毁");
    }
}
