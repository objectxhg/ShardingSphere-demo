package com.xhg.shardingspheredemo.service.serviceImpl;

import com.xhg.shardingspheredemo.mapper.OrdersMapper;
import com.xhg.shardingspheredemo.mapper.UserMapper;
import com.xhg.shardingspheredemo.pojo.Orders;
import com.xhg.shardingspheredemo.pojo.User;
import com.xhg.shardingspheredemo.service.OrdersService;
import com.xhg.shardingspheredemo.service.UserService;
import com.xhg.shardingspheredemo.utils.SnowflakeIdWorker;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author xiaoh
 * @create 2020/12/28 10:45
 */

@Service
public class OrdersServiceImpl implements OrdersService {

    @Resource
    private OrdersMapper OrdersMapper;


    @Override
    public Integer addOrdersService(Integer userId, BigDecimal price, String description) {

        Orders orders = new Orders();
        orders.setOrderId(SnowflakeIdWorker.generateId());
        orders.setUserId(userId);
        orders.setPrice(price);
        orders.setDescription(description);
        return OrdersMapper.insertOrders(orders);
    }

    @Override
    public List<Orders> selectOrdersList() {
        return OrdersMapper.selectOrdersList();
    }
}

