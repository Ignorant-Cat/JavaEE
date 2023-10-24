package com.azy.annotation.dao.impl;

import com.azy.annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

//@Component定义bean
//@Component("bookDao")
//@Repository：@Component衍生注解
@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    @Value("${jdbc.username}")
    private String username; //简单数据类型自动装配

    public void save() {
        System.out.println("book dao save ..." + this.username);
    }
}
