package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(String id);

    void update(Customer customer);

    void remove(String id);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findByNameOrAddressContain(String customerName,Pageable pageable);
}
