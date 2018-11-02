package com.gj.test;


import com.gj.Utils.MyUtil;
import com.gj.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Test2 {

    @Test
    public void testAdd(){
        SqlSession session = MyUtil.getSession();
        User user = new User("李四","123456",15,1);
        String statement = "mapping.userMapper.addUser";

        int insert = session.insert(statement, user);
        session.commit();
        session.close();

        System.out.println(insert);

    }

    @Test
    public void testDel(){
        SqlSession session = MyUtil.getSession();
        String statement = "mapping.userMapper.deleteUserById";
        int delete = session.delete(statement, 4);
        System.out.println(delete);
        session.commit();
        session.close();
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = MyUtil.getSession();
        String statement = "mapping.userMapper.updateUser";
        User user = new User("李四","666666",15,1);
        user.setId(1);
        int update = sqlSession.update(statement, user);
        System.out.println(update);
        sqlSession.commit();

    }

    @Test
    public void testGetUser(){
        SqlSession sqlSession = MyUtil.getSession();
        String statement = "mapping.userMapper.getUser";
        User user = sqlSession.selectOne(statement, 1);
        System.out.println(user);

    }



}
