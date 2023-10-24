package com.azy.annotation.service.impl;


import com.azy.annotation.mapper.BrandDao;
import com.azy.annotation.pojo.Brand;
import com.azy.annotation.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

//    @Autowired
    @Resource
    private BrandDao brandDao;

    public List<Brand> selectAll() {
        List<Brand> brands = brandDao.selectAll();
        return brands;
    }

    public Brand selectById(int id) {
        return brandDao.selectById(id);
    }

    //根据条件查询
    public List<Brand> selectByCondition(Brand brand) {
        return brandDao.selectByCondition(brand);
    }

    //根据条件动态查询
    public List<Brand> selectByConditions(Brand brand) {
        return brandDao.selectByConditions(brand);
    }

    //添加数据
    public int add(Brand brand) {
        return brandDao.add(brand);
    }

    //更新数据
    public int update(Brand brand) {
        return brandDao.update(brand);
    }

    //删除
    public int deleteByIds(int[] ids) {
        return brandDao.deleteByIds(ids);
    }
}
