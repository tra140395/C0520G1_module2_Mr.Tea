package com.codegym.security.service;

import com.codegym.security.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(Long id);

    void save(Product product);

    void removeById(long id);
}
