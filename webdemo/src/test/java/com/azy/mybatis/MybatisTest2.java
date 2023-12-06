package com.azy.mybatis;

import com.azy.mapper.BrandMapper;
import com.azy.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest2 {
    @Test
    public void testSelectAll() throws IOException {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 执行sql
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);
        //4. 释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByID() throws IOException {
        int id = 2;

        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 执行sql
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = brandMapper.selectById(id);
        System.out.println(brand);
        //4. 释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByCondition() throws IOException {
        //接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";


        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 执行sql
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //方法一：多参数
//        List<Brand> brands = brandMapper.selectByCondition(status, brandName, companyName);

//        方法二：Brand
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        List<Brand> brands = brandMapper.selectByCondition(brand);

//        //方法三：map
//        Map map = new HashMap();
//        map.put("status",status);
//        map.put("brandName",brandName);
//        map.put("companyName",companyName);
//        List<Brand> brands = brandMapper.selectByCondition(map);

        System.out.println(brands);
        //4. 释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByConditions() throws IOException {
        //接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";


        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 执行sql
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = new Brand();
        //brand.setStatus(status);
        //brand.setBrandName(brandName);
        //brand.setCompanyName(companyName);
        List<Brand> brands = brandMapper.selectByConditions(brand);
        System.out.println(brands);
        //4. 释放资源
        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {
        //接收参数
        int status = 1;
        String companyName = "华为2";
        String brandName = "荣耀";

        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 执行sql
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brandMapper.add(brand);
        //4. 释放资源
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        //接收参数
        int id = 5;
        int status = 0;
        String companyName = "华为3";
        String brandName = "荣耀22222";

        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 执行sql
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = new Brand();
        brand.setId(id);
        brand.setStatus(status);
        brand.setBrandName(brandName);
        //brand.setCompanyName(companyName);
        brandMapper.update(brand);
        //4. 释放资源
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDelete() throws IOException {
        //接收参数
        int[] ids = {5, 6};

        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 执行sql
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        brandMapper.deleteByIds(ids);
        //4. 释放资源
        sqlSession.commit();
        sqlSession.close();
    }
}
