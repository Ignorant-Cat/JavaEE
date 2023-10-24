package com.azy.controller;

import com.azy.pojo.Brand;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//待完善。。。。
@RestController
@RequestMapping("/brands")
public class BrandController {

    //添加数据
    @PostMapping
    int add(@RequestBody Brand brand) {
        return 0;
    }

    //删除
    @DeleteMapping("/{id}")
    int deleteById(@PathVariable int id) {
        return 0;
    }

    //更新数据
    @PutMapping
    int update(@RequestBody Brand brand) {
        return 0;
    }

    @GetMapping("/{id}")
    Brand selectById(@PathVariable int id) {
        return null;
    }

    @GetMapping
    List<Brand> selectAll(){
        return null;
    }

}
