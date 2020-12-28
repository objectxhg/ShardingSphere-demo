package com.xhg.shardingspheredemo.pojo;

import java.io.Serializable;

/**
 * @Author xiaoh
 * @create 2020/12/28 10:07
 */
public class User implements Serializable {

    public User(){

    }

    public User(Long id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private Long id;

    private String name;

    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

