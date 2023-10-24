package com.azy.annotation.service.impl;

import com.azy.annotation.dao.BookDao;
import com.azy.annotation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component定义bean
//@Component
//@Service：@Component衍生注解
@ConditionalOnClass(name = "com.azy.annotation.pojo.Book")
//有Book类的时候才加载
@Service
public class BookServiceImpl implements BookService {

    @Autowired //引用数据类型自动装配
//    @Qualifier("bookDao")//有多个实现的时候可以使用名字
    private BookDao bookDao;

    //setter可以不要
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    @PostConstruct //生命周期函数
    public void init() {
        System.out.println("init ~~~~");
    }

    @PreDestroy //生命周期函数
    public void destroy() {
        System.out.println("destroy ~~~");
    }
}
