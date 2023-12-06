package com.azy.ioc.service.impl;

import com.azy.ioc.service.UserService;


//有参构造初始化
public class UserServiceImpl3 implements UserService {

    public UserServiceImpl3(String name) {
        System.out.println("UserServiceImpl3引用"+ name);
    }
}
