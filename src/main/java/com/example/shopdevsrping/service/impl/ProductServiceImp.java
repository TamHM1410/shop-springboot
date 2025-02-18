package com.example.shopdevsrping.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.shopdevsrping.entity.ProductEntity;
import com.example.shopdevsrping.repository.ProductRepository;
import com.example.shopdevsrping.service.ProductService;


@Service
public class ProductServiceImp implements ProductService{

    private ProductRepository productRepository;

    @Override
    public ProductEntity createProduct(ProductEntity product) {
        return productRepository.createProduct(product);
    }

    @Override
    public List<ProductEntity> findAllProduct() {
        return productRepository.findAllProduct();
    }
    
}
