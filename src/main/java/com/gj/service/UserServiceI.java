package com.gj.service;

import com.gj.domain.User;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 基于注解，增删改查
 */
public interface UserServiceI {

    @Insert("insert into user(name,password,age,deleteFlag) values(#{name},#{password},#{age},#{deleteFlag})")
    public int addUser(User user);

    @Delete("delete from user where id = #{id}")
    public int deleteUser(int id);

    @Update("update user set name=#{name},password=#{password},age=#{age},deleteFlag=#{deleteFlag} where id=#{id}")
    public int updateUser(User user);

    @Select("select * from user where id=#{id}")
    public User getUser(int id);
}
