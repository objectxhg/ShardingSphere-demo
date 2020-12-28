package com.xhg.shardingspheredemo.controller;

import com.xhg.shardingspheredemo.pojo.User;
import com.xhg.shardingspheredemo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author xiaoh
 * @create 2020/12/28 10:46
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUserController(String name, Integer age){


        return userService.addUserService(name, age) == 1 ? "添加成功" : "添加失败";
    }

    @RequestMapping("/findUserAll")
    public List<User> test(){

        return userService.selectUserList();
    }


}

