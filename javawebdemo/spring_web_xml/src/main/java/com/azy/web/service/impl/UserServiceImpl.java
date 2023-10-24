package com.azy.web.service.impl;

import com.azy.web.dao.UserDao;
import com.azy.web.pojo.User;
import com.azy.web.service.UserService;

public class UserServiceImpl implements UserService {

    private  UserDao dao;

    public void setUserDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public User login(String username, String passwd) {
        User user = dao.select(username, passwd);
        return user;
    }


    @Override
    public boolean register(User user) {
        User user1 = dao.selectByUsername(user.getUsername());
        if(user1 == null ){
            //可以注册
            dao.add(user);
        }
        return user1 == null;
    }
}
