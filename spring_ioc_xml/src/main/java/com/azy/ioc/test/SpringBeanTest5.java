package com.azy.ioc.test;

import com.azy.ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
//3、实例工厂初始化
* */
public class SpringBeanTest5 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userService5");
        System.out.println(userService);
    }
}
