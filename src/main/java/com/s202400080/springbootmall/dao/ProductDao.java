package com.s202400080.springbootmall.dao;

import com.s202400080.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
