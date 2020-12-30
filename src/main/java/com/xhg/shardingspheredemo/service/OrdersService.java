package com.xhg.shardingspheredemo.service;

import com.xhg.shardingspheredemo.pojo.Orders;
import com.xhg.shardingspheredemo.pojo.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author xiaoh
 * @Description:
 * @create 2020/12/28 10:44
 */
public interface OrdersService {

    Integer addOrdersService(Integer userId, BigDecimal price, String description);

    List<Orders> selectOrdersList();
}
