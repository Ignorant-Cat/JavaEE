package com.azy.service;

import com.azy.pojo.Brand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BrandService {
    List<Brand> selectAll();

    Brand selectById(int id);

    //添加数据
    int add(Brand brand);

    //更新数据
    int update(Brand brand);

    //删除
    int deleteById(int id);
}
