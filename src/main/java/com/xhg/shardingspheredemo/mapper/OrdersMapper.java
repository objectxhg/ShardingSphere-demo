package com.xhg.shardingspheredemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhg.shardingspheredemo.pojo.Orders;

import java.util.List;

/**
 * @Author xiaoh
 * @Description:
 * @create 2020/12/29 11:41
 */
public interface OrdersMapper extends BaseMapper<Orders> {

    Integer insertOrders(Orders orders);

    List<Orders> selectOrdersList();
}
