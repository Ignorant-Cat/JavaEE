package com.azy.ioc.test;

import com.azy.ioc.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


/*
利用beanFactory生成Bean对象
BeanFactory是在首次调用getBean时才进行Bean的创建，
而ApplicationContext则是配置文件加载，容器一创建就将Bean都实例化并初始化好
* */
public class SpringBeanTest1 {
    public static void main(String[] args) {
        //创建BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //创建读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        //加载配置文件
        reader.loadBeanDefinitions("beans.xml");
        //获取Bean实例对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println(userService);
    }
}
