package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    static Map<Integer, Product> productList;
    static {
        productList = new HashMap<>();
        productList.put(1,new Product(1,"gao",200));
        productList.put(2,new Product(2,"giuong",376));
        productList.put(3,new Product(3,"ghe",234));
        productList.put(4,new Product(4,"goi",546));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productList.put(product.getId(),product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }
}
