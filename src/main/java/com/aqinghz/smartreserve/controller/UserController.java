package com.aqinghz.smartreserve.controller;

import com.aqinghz.smartreserve.entity.User; // Import the User class
import com.aqinghz.smartreserve.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserMapper userMapper;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        // 使用 MyBatis-Plus 的 BaseMapper 方法查询所有用户
        return userMapper.selectList(null);
    }

    @PostMapping("/users")
    public String addUser(@RequestBody User user) {
        // 使用 MyBatis-Plus 的 BaseMapper 方法插入用户
        int rows = userMapper.insert(user);
        if (rows > 0) {
            // 如果插入成功，返回成功消息
            return "User added successfully";
        } else {
            // 如果插入失败，返回失败消息
            return "Failed to add user";
        }
    }
}