package com.azy.annotation.service;

import com.azy.annotation.pojo.Brand;

import java.util.List;

/*
 * BrandService
 *    -BrandServiceImpl
 * 和BrandDao(mybatis)
 *
 * */
public interface BrandService {

    List<Brand> selectAll();

    Brand selectById(int id);

    //根据条件查询
    List<Brand> selectByCondition(Brand brand);

    //根据条件动态查询
    List<Brand> selectByConditions(Brand brand);

    //添加数据
    int add(Brand brand);

    //更新数据
    int update(Brand brand);

    //删除
    int deleteByIds(int[] ids);

}
