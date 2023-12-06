package com.azy.ioc.test;

import com.azy.ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
//4、FactoryBean初始化

加载配置后，会把FactoryBean建立
当getBean的时候才会创建Bean对象,存储到 factoryBeanObjectCache 缓存池

* */
public class SpringBeanTest6 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userService6");
        System.out.println(userService);
    }
}
