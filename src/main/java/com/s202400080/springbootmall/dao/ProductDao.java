package com.s202400080.springbootmall.dao;

import com.s202400080.springbootmall.constant.ProductCategory;
import com.s202400080.springbootmall.dto.ProductQueryParams;
import com.s202400080.springbootmall.dto.ProductRequest;
import com.s202400080.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById(Integer productId);
}
