package com.example.shopdevsrping.service;

import java.util.List;

import com.example.shopdevsrping.entity.ProductEntity;

public interface ProductService {
    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAllProduct();

}
