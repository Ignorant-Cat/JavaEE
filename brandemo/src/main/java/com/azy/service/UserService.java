package com.azy.service;

import com.azy.mapper.UserMapper;
import com.azy.pojo.User;
import com.azy.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public User login(String username, String passwd) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.select(username, passwd);

        sqlSession.close();
        return user;
    }


    public boolean register(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.selectByUsername(user.getUsername());
        if(user1 == null ){
            //可以注册
            mapper.add(user);
            sqlSession.commit();
        }

        sqlSession.close();
        return user1 == null;
    }

}
