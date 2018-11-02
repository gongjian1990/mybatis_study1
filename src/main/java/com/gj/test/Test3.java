package com.gj.test;

import com.gj.Utils.MyUtil;
import com.gj.domain.User;
import com.gj.service.UserServiceI;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class Test3 {

    @Test
    public void testAdd(){
        User user = new User("王五","123456",20,2);
        SqlSession session = MyUtil.getSession();
        UserServiceI userMapper = session.getMapper(UserServiceI.class);
        userMapper.addUser(user);
        session.commit();

    }

    @Test
    public void testDelete(){
        SqlSession session = MyUtil.getSession();
        UserServiceI userMapper = session.getMapper(UserServiceI.class);
        userMapper.deleteUser(5);
        session.commit();
    }

    @Test
    public void testUpdate(){
        SqlSession session = MyUtil.getSession();
        UserServiceI userMapper = session.getMapper(UserServiceI.class);
        User user = new User("王五","123456",20,2);
        user.setId(1);
        userMapper.updateUser(user);
        session.commit();

    }

    @Test
    public void testGetUser(){
        SqlSession session = MyUtil.getSession();
        UserServiceI userMapper = session.getMapper(UserServiceI.class);
        User usere = userMapper.getUser(1);
        System.out.println(usere);
    }
}
