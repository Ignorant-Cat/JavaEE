package com.azy.dao;

import com.azy.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

public  interface BrandDao {

    @Select("select * from tb_brand")
    @Results(id = "brandResultMap",value = {
            @Result(column = "brand_name",property = "brandName"),
            @Result(column = "company_name",property = "companyName")
    })
    List<Brand> selectAll();

    @Select("select * from tb_brand where id = #{id}")
    @ResultMap("brandResultMap")
    Brand selectById(int id);

    @Insert("insert into tb_brand values (null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    int add(Brand brand);

    @Delete("delete from tb_brand where id = #{id}")
    int deleteById(int id);

    @Update("update tb_brand set brand_name = #{brandName},company_name = #{companyName},ordered =#{ordered},description = #{description},status = #{status} where id = #{id}")
    int update(Brand brand);



}
