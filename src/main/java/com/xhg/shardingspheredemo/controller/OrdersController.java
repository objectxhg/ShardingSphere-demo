package com.xhg.shardingspheredemo.controller;

import com.xhg.shardingspheredemo.pojo.Orders;
import com.xhg.shardingspheredemo.pojo.User;
import com.xhg.shardingspheredemo.service.OrdersService;
import com.xhg.shardingspheredemo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author xiaoh
 * @create 2020/12/28 10:46
 */

@RestController
public class OrdersController {

    @Resource
    private OrdersService ordersService;

    @RequestMapping("/addOrder")
    public String addUserController(Integer userId, String price, String description){


        return ordersService.addOrdersService(userId, new BigDecimal(price), description) == 1 ? "添加成功" : "添加失败";
    }

    @RequestMapping("/findOrderAll")
    public List<Orders> test(){

        return ordersService.selectOrdersList();
    }


}

