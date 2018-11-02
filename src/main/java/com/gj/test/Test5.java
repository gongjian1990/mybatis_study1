package com.gj.test;

import com.gj.Utils.MyUtil;
import com.gj.domain.Classes;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class Test5 {

    @Test
    public void testGetClass(){
        SqlSession sqlSession = MyUtil.getSession();
        String statement = "mapping.classMapper.getClass";

        Classes classes = sqlSession.selectOne(statement, 1);

        System.out.println(classes);
        sqlSession.close();
    }

    @Test
    public void testGetClass2(){
        SqlSession sqlSession = MyUtil.getSession();
        String statement = "mapping.classMapper.getClass2";

        Classes classes = sqlSession.selectOne(statement, 1);
        sqlSession.close();

        System.out.println(classes);

    }

    @Test
    public void testGetClass3(){
        SqlSession sqlSession = MyUtil.getSession();
        String statement = "mapping.classMapper.getClass";
        Classes classes = sqlSession.selectOne(statement,1);
        System.out.println(classes);
        sqlSession.close();
    }

    @Test
    public void testGetClass4(){
        SqlSession sqlSession = MyUtil.getSession();
        String statement = "mapping.classMapper.getClass4";
        Classes classes = sqlSession.selectOne(statement,1);
        System.out.println(classes);
        sqlSession.close();
    }
}
