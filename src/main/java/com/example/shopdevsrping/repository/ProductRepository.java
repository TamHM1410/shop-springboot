package com.example.shopdevsrping.repository;

import java.util.List;

import com.example.shopdevsrping.entity.ProductEntity;

public interface ProductRepository {
    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAllProduct();

}