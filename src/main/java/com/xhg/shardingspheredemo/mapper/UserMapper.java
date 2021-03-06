package com.xhg.shardingspheredemo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhg.shardingspheredemo.pojo.Orders;
import com.xhg.shardingspheredemo.pojo.User;

import java.util.List;

/**
 * @Author xiaoh
 * @Description:
 * @create 2020/12/28 10:42
 */
public interface UserMapper extends BaseMapper<User> {

    Integer insertUser(User user);

    List<User> selectUserList();
}
