package com.s202400080.springbootmall.dao;

import com.s202400080.springbootmall.dto.UserRegisterRequest;
import com.s202400080.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
