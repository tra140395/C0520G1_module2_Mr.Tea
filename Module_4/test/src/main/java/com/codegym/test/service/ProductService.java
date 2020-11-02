package com.codegym.test.service;

import com.codegym.test.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(Product product);

    void remove(int id);

    Page<Product> findAll(Pageable pageable);

    Page<Product> findByName(String inputName,Pageable pageable);
    Page<Product> findByPrice(int price,Pageable pageable);
}
