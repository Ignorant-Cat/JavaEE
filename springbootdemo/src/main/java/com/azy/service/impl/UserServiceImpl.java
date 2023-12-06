package com.azy.service.impl;

import com.azy.dao.UserDao;
import com.azy.pojo.User;
import com.azy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserDao dao;

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

    @Override
    public User getByUsername(String username) {
        return dao.selectByUsername(username);
    }
}
