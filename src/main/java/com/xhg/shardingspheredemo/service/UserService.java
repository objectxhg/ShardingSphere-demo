package com.xhg.shardingspheredemo.service;

import com.xhg.shardingspheredemo.pojo.User;

import java.util.List;

/**
 * @Author xiaoh
 * @Description:
 * @create 2020/12/28 10:44
 */
public interface UserService {

    Integer addUserService(String name, Integer age);

    List<User> selectUserList();
}
