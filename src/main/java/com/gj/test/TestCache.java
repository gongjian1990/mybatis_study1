package com.gj.test;

import com.gj.Utils.MyUtil;
import com.gj.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;

public class TestCache {

    /**
     * 一级缓存，默认开启，session级别的缓存
     */
    @Test
    public void testCache1(){
        SqlSession session = MyUtil.getSession();
        User user = session.selectOne("mapping.userMapper.getUser",1);
        System.out.println(user);


        /**
         * 一级缓存默认会被使用
         */
        User user1 = session.selectOne("mapping.userMapper.getUser",1);
        System.out.println("11:"+user1);

        session.clearCache();
        user1 = session.selectOne("mapping.userMapper.getUser",1);
        System.out.println("22:"+user1);
        session.close();
    }

    @Test
    public void testCache2(){
        SqlSessionFactory sqlSessionFactory = MyUtil.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();
        SqlSession session1 = sqlSessionFactory.openSession();

        User user1 = session.selectOne("mapping.userMapper.getUser",1);
        session.commit();//不懂为啥，这个地方一定要提交事务之后二级缓存才会起作用
        System.out.println("user1---"+user1);
        User user2 = session1.selectOne("mapping.userMapper.getUser",1);
        System.out.println("user2---"+user2);
        //session1.close();

    }
}
