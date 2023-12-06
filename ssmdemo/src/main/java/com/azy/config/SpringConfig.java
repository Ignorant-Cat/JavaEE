package com.azy.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.azy.service")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement //开启事务
@Import({MybatisConfig.class,JdbcConfig.class})
public class SpringConfig {
}
