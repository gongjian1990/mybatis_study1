package com.gj.Utils;

import com.gj.test.Test2;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyUtil {

    public static SqlSession getSession(){
        String resource = "conf.xml";
        InputStream is = MyUtil.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }

    public static SqlSessionFactory getSqlSessionFactory(){
        String resource = "conf.xml";
        InputStream is = MyUtil.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        return sqlSessionFactory;
    }


}
