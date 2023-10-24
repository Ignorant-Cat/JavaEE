package com.azy.ioc.test;

import com.azy.ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
测试init-method和destroy-method
* */
public class SpringBeanTest3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userService2");
        System.out.println(userService);
    }
}
