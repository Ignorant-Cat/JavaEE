package com.azy.annotation;

import com.azy.annotation.config.SpringConfig3;
import com.azy.annotation.pojo.Brand;
import com.azy.annotation.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//整合Junit

@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring环境对应的配置类
@ContextConfiguration(classes = {SpringConfig3.class})//加载配置类
public class SpringAnnotationTest4 {
    //支持自动装配注入bean
    @Autowired
    private BrandService BrandService;

    @Test
    public void test() {
        Brand brand = BrandService.selectById(1);
        System.out.println(brand);
    }

}
