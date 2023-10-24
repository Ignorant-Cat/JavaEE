package com.azy.service.impl;


import com.azy.dao.BrandDao;
import com.azy.pojo.Brand;
import com.azy.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;

    public List<Brand> selectAll() {
        List<Brand> brands = brandDao.selectAll();
        return brands;
    }

    public Brand selectById(int id) {
        return brandDao.selectById(id);
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
    public int deleteById(int id) {
        return brandDao.deleteById(id);
    }
}
