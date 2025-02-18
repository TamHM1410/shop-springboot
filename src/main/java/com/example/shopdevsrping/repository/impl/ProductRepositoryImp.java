package com.example.shopdevsrping.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.shopdevsrping.entity.ProductEntity;
import com.example.shopdevsrping.repository.ProductRepository;


@Repository

public class ProductRepositoryImp implements ProductRepository {

    @Override
    public ProductEntity createProduct(ProductEntity product) {

        ProductEntity productEntity = new ProductEntity();
        // productEntity.setId(1l)

        return productEntity;
    }

    @Override
    public List<ProductEntity> findAllProduct() {

        return List.of();

    }

}
