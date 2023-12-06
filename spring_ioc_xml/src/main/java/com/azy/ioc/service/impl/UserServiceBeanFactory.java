package com.azy.ioc.service.impl;


//2、静态工厂初始化
public class UserServiceBeanFactory {

    public static UserServiceImpl getUserServiceImpl(String name) {
        return new UserServiceImpl();
    }
}
