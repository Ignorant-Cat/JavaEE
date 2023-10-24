package com.azy.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
配置第三方bean:sqlSession
* */
public class SqlSessionFactoryTest {
    public static void main(String[] args) throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        Object sqlSession = applicationContext.getBean("sqlSession");
        Object sqlSession2 = applicationContext.getBean("sqlSession");
        System.out.println(sqlSession);
        System.out.println(sqlSession2);

    }
}
