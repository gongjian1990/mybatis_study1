package com.gj.test;

import com.gj.Utils.MyUtil;
import com.gj.domain.Order;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

public class Test4 {

    @Test
    public void test01(){
        SqlSession session = MyUtil.getSession();
        String statement = "mapping.orderMapper.getOrderById";

        Order order = session.selectOne(statement, 1);

        session.close();

        System.out.println(order);

    }

    @Test
    public void test02(){
        SqlSession session = MyUtil.getSession();
        String statement = "mapping.orderMapper.getOneOrder";

        Order order = session.selectOne(statement, 1);

        session.close();

        System.out.println(order);

    }

    @Test
    public void test03(){
        SqlSession session = MyUtil.getSession();
        String statement = "mapping.orderMapper.getOneOrder1";

        Order order = session.selectOne(statement, 1);

        session.close();

        System.out.println(order);

    }


}
