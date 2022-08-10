package com.s202400080.springbootmall.service.impl;

import com.s202400080.springbootmall.dao.UserDao;
import com.s202400080.springbootmall.dto.UserRegisterRequest;
import com.s202400080.springbootmall.model.User;
import com.s202400080.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
