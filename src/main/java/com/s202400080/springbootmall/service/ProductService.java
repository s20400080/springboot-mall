package com.s202400080.springbootmall.service;

import com.s202400080.springbootmall.constant.ProductCategory;
import com.s202400080.springbootmall.dto.ProductRequest;
import com.s202400080.springbootmall.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
