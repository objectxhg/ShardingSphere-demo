package com.xhg.shardingspheredemo.service.serviceImpl;

import com.xhg.shardingspheredemo.mapper.UserMapper;
import com.xhg.shardingspheredemo.pojo.User;
import com.xhg.shardingspheredemo.service.UserService;
import com.xhg.shardingspheredemo.utils.SnowflakeIdWorker;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author xiaoh
 * @create 2020/12/28 10:45
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Integer addUserService(String name, Integer age) {

        return userMapper.insertUser(new User(SnowflakeIdWorker.generateId(), name, age));
    }

    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }
}

