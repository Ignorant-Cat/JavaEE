package com.azy.mapper;

import com.azy.pojo.Brand;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();

    Brand selectById(int id);

    //根据条件查询
//    List<Brand> selectByCondition(@Param("status") int status, @Param("brandName")String brandName,@Param("companyName") String companyName);
    List<Brand> selectByCondition(Brand brand);
//    List<Brand> selectByCondition(Map map);

    //根据条件动态查询
    List<Brand> selectByConditions(Brand brand);

    //添加数据
    int add(Brand brand);

    //更新数据
    int update(Brand brand);

    //删除
    int deleteByIds(int[] ids);

}
