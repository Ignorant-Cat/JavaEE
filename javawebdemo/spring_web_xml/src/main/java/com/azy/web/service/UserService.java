package com.azy.web.service;

import com.azy.web.pojo.User;

public interface UserService {
    User login(String username, String passwd);
    boolean register(User user);
}
