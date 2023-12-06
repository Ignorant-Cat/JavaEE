package com.azy.annotation.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


//对应mybatis-config.xml文件
@MapperScan("com.azy.annotation.mapper")
public class MybatisConfig {

    @Bean //形参可以自动装配,idea有病会报错
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setTypeAliasesPackage("com.azy.annotation.pojo");
        sqlSessionFactory.setDataSource(dataSource);
        return sqlSessionFactory;
    }

//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer msc = new MapperScannerConfigurer();
//        msc.setBasePackage("com.azy.annotation.mapper");//mybatis的包扫描
//        return msc;
//    }
//    <mappers>
//        <!--加载sql映射文件-->
//        <!--<mapper resource="com/azy/annotation/mapper/UserMapper.xml"/>-->
//        <package name="com.azy.annotation.mapper"/>
//    </mappers>

}
