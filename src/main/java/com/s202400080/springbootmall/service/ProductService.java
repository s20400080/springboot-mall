package com.s202400080.springbootmall.service;

import com.s202400080.springbootmall.dto.ProductRequest;
import com.s202400080.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

}
