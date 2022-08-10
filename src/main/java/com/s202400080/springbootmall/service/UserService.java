package com.s202400080.springbootmall.service;

import com.s202400080.springbootmall.dto.UserRegisterRequest;
import com.s202400080.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
