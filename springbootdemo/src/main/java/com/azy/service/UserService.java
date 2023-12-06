package com.azy.service;

import com.azy.pojo.User;

public interface UserService {
    User login(String username, String passwd);
    boolean register(User user);
    User getByUsername(String username);
}
