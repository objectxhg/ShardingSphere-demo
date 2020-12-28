package com.xhg.shardingspheredemo.mapper;


import com.xhg.shardingspheredemo.pojo.User;

import java.util.List;

/**
 * @Author xiaoh
 * @Description:
 * @create 2020/12/28 10:42
 */
public interface UserMapper {

    Integer insertUser(User user);

    List<User> selectUserList();
}
