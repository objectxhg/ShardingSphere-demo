package com.xhg.shardingspheredemo;

import com.xhg.shardingspheredemo.mapper.UserMapper;
import com.xhg.shardingspheredemo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShardingsphereDemoApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void tesDemo(){

        userMapper.insert(new User("小吴", 19));

    }

}
