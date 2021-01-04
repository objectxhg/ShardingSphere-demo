package com.xhg.shardingspheredemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xhg.shardingspheredemo.mapper.OrdersMapper;
import com.xhg.shardingspheredemo.mapper.UserMapper;
import com.xhg.shardingspheredemo.pojo.Orders;
import com.xhg.shardingspheredemo.pojo.User;
import com.xhg.shardingspheredemo.utils.SnowflakeIdWorker;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Wrapper;
import java.util.List;

@SpringBootTest
class ShardingsphereDemoApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Resource
    private OrdersMapper ordersMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void tesDemo(){

        userMapper.insert(new User("小余", 21));

    }

    @Test
    void selectDemo(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", 1344466073236115458L);
        User user = userMapper.selectOne(queryWrapper);
        System.out.println(user);
    }

    @Test
    void selectOrderDemo(){
        List<Orders> list = ordersMapper.selectOrdersList();
        System.out.println(list);
    }

    @Test
    void addOrderDemo(){

        Orders orders = new Orders();
        orders.setOrderId(SnowflakeIdWorker.generateId());
        orders.setUserId(1);
        orders.setPrice(new BigDecimal(21));
        orders.setDescription("订单详情");

        ordersMapper.insert(orders);

    }

}
