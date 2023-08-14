package com.canny.cannycraftboard.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.canny.cannycraftboard.entity.User;
import com.canny.cannycraftboard.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
    @Autowired
    private UserMapper userMapper;
    public String login(String username, String password) {
        QueryWrapper<User> wrapper = new QueryWrapper<>(new User());
        wrapper.eq("username", username);
        User getUser = userMapper.selectOne(wrapper);
        if(getUser == null) {
            return "noUser";
        }
        if(getUser.getPassword().equals(password)){
            return "token123";
        }
        else
            return "fail";
    }
}