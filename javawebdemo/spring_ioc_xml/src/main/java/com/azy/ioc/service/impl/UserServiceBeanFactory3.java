package com.azy.ioc.service.impl;


import com.azy.ioc.service.UserService;
import org.springframework.beans.factory.FactoryBean;

//2、实例工厂初始化
public class UserServiceBeanFactory3 implements FactoryBean<UserService> {

    @Override
    public UserService getObject() throws Exception {
        return new UserServiceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }
}
