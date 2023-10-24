package com.azy.ioc.test;

import com.azy.ioc.mapper.UserMapper;
import com.azy.ioc.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMybatisTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper bean = classPathXmlApplicationContext.getBean(UserMapper.class);
        User user = bean.selectByUsername("zhangsan");
        System.out.println(user);
    }
}
