package com.azy.ioc.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
配置第三方bean:druidDataSource
* */
public class DruidDataSourceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        DruidDataSource druidDataSource = (DruidDataSource) applicationContext.getBean("druidDataSource");
        System.out.println(druidDataSource);

    }
}
