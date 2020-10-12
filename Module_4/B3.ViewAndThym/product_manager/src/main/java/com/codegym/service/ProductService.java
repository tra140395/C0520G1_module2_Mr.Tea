package com.codegym.service;

import com.codegym.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
