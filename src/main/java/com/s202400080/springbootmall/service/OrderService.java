package com.s202400080.springbootmall.service;

import com.s202400080.springbootmall.dto.CreateOrderRequest;
import com.s202400080.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
