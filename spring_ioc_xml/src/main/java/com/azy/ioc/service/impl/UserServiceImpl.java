package com.azy.ioc.service.impl;

import com.azy.ioc.dao.UserDao;
import com.azy.ioc.service.UserService;

public class UserServiceImpl implements UserService {
    public void setUserDao(UserDao userDao) {
        System.out.println("UserServiceImpl引用"+ userDao);
    }
}
