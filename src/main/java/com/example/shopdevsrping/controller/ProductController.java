package com.example.shopdevsrping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopdevsrping.entity.ProductEntity;
import com.example.shopdevsrping.service.ProductService;
import com.example.shopdevsrping.utils.Constants;

@RestController
@RequestMapping(Constants.PREFIX_ENDPOINT + "v1")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public ProductEntity creaProductEntity(ProductEntity productEntity) {
        return productService.createProduct(productEntity);
    }

}
