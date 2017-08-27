package com.fhgroup.cn.service.user.impl;

import com.fhgroup.cn.dao.user.UserMapper;
import com.fhgroup.cn.pojo.user.User;
import com.fhgroup.cn.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
