package com.azy.controller;

import com.azy.pojo.User;
import com.azy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}") //没有$符号！！！
    public User show(@PathVariable String username){
        User user = userService.getByUsername(username);
        return user;
    }

    @GetMapping("/show")
    public String  show1(){
        return "hello spring boot";
    }

}
