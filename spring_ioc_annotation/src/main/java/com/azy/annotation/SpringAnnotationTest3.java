package com.azy.annotation;

import com.azy.annotation.config.SpringConfig3;
import com.azy.annotation.service.BrandService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//注解整合Mybatis
public class SpringAnnotationTest3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig3.class);
        context.registerShutdownHook();//测试销毁生命周期，提前注册
        BrandService brandService = context.getBean(BrandService.class);
        System.out.println(brandService.selectAll());
    }

}
