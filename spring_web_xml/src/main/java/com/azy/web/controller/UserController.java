package com.azy.web.controller;

import com.azy.web.pojo.User;
import com.azy.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping(value = "/show",method = RequestMethod.GET)
    @GetMapping("/show")
    public String show(@RequestParam("username") String username , int age ,String sex){
        System.out.println(username+ ":"+ age + "," + sex);
        return "/index.jsp";
    }

    @GetMapping("/show1")
    public String show1(@RequestBody User user){
        System.out.println(user);
        return "/index.jsp";
    }

}
