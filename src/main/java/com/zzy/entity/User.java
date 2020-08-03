package com.zzy.entity;

import java.util.Date;

public class User {
    private String name;
    private  Integer age;
    private Date birday;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birday=" + birday +
                '}';
    }
}
