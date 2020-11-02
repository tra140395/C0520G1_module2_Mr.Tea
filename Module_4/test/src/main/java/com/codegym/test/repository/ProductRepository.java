package com.codegym.test.repository;

import com.codegym.test.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    Page<Product> findProductByNameContaining(String input,Pageable pageable);
    Page<Product> findProductByPrice(int input,Pageable pageable);
}
