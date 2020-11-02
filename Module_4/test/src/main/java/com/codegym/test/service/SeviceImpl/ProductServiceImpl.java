package com.codegym.test.service.SeviceImpl;

import com.codegym.test.model.Product;
import com.codegym.test.repository.ProductRepository;
import com.codegym.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void remove(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Product> findByName(String inputName, Pageable pageable) {
        return productRepository.findProductByNameContaining(inputName,pageable) ;
    }

    @Override
    public Page<Product> findByPrice(int price, Pageable pageable) {
        return productRepository.findProductByPrice(price,pageable);
    }
}
