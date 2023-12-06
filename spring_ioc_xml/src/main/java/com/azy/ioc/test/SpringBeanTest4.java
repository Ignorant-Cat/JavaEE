package com.azy.ioc.test;

import com.azy.ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
//1、有参构造初始化
* */
public class SpringBeanTest4 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userService3");
        System.out.println(userService);
    }
}
