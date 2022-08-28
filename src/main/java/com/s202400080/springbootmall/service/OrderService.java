package com.s202400080.springbootmall.service;

import com.s202400080.springbootmall.dto.CreateOrderRequest;
import com.s202400080.springbootmall.dto.OrderQueryParams;
import com.s202400080.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
