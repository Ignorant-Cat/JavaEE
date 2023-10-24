package com.azy.service;


import com.azy.mapper.BrandMapper;
import com.azy.pojo.Brand;
import com.azy.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BrandService {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();;

    public List<Brand> selectAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        List<Brand> brands = mapper.selectAll();

        sqlSession.close();

        return brands;
    }

    public void Add(Brand brand) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.Add(brand);
        sqlSession.commit();
        sqlSession.close();
    }

    public Brand selectById(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = mapper.selectById(id);
        sqlSession.close();

        return brand;
    }

    public void update(Brand brand) {
        //2. 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //4. 调用方法
        mapper.update(brand);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    public void deleteById(int id) {
        //2. 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //4. 调用方法
        mapper.deleteById(id);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
