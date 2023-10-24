package com.azy.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

//注解整合Mybatis
@Configuration
@ComponentScan("com.azy.annotation") //包扫描
@PropertySource("jdbc.properties") //不能使用通配符
@Import({DruidConfig.class, MybatisConfig.class})
public class SpringConfig3 {
}
