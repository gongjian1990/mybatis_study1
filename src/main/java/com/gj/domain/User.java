package com.gj.domain;

import java.io.Serializable;

public class User implements Serializable {

    private int id;
    private String name;
    private String password;
    private int age;
    private int deleteFlag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

    public User(String name, String password, int age, int deleteFlag) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.deleteFlag = deleteFlag;
    }

    public User() {
    }
}
