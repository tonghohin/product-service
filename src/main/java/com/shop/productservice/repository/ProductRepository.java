package com.shop.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shop.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
