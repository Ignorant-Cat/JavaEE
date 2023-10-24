package com.azy.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//注解开发，替换配置文件applicationContext.xml
@Configuration
@ComponentScan("com.azy.annotation") //包扫描
@PropertySource("jdbc.properties") //不能使用通配符
public class SpringConfig1 {
}
