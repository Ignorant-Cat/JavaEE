package com.azy.ioc.service.impl;


//2、实例工厂初始化
public class UserServiceBeanFactory2 {

    public UserServiceImpl getUserServiceImpl(String name) {
        return new UserServiceImpl();
    }
}
