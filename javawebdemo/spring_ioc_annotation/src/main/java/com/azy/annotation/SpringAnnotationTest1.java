package com.azy.annotation;

import com.azy.annotation.config.SpringConfig1;
import com.azy.annotation.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//注解开发，替换配置文件
public class SpringAnnotationTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig1.class);
        context.registerShutdownHook();//测试销毁生命周期，提前注册
        BookService bean = context.getBean(BookService.class);
//        System.out.println(bean);//测试IOC
        bean.save();//测试依赖注入
//        context.close();//测试销毁生命周期,强制执行
    }

}
