package com.azy.web;

import com.azy.web.pojo.User;
import com.azy.web.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringBeanTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        System.out.println(userDao);
        UserService userService = (UserService) applicationContext.getBean("userService");
        User user = userService.login("zhangsan", "123");
        System.out.println(user);
    }
}
