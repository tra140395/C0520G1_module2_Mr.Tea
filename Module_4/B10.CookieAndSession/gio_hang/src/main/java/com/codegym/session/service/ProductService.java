package com.codegym.session.service;

import com.codegym.session.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(Long id);

    void save(Product product);

    void removeById(long id);
}
