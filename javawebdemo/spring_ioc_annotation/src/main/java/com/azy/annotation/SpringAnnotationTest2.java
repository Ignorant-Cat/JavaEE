package com.azy.annotation;

import com.azy.annotation.config.SpringConfig1;
import com.azy.annotation.config.SpringConfig2;
import com.azy.annotation.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

//注解整合Druid
public class SpringAnnotationTest2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig2.class);
        context.registerShutdownHook();//测试销毁生命周期，提前注册
        DataSource bean = context.getBean(DataSource.class);
        System.out.println(bean);
    }

}
