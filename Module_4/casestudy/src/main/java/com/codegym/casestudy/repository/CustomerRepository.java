package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {
   Page<Customer> findCustomerByCustomerNameContainingOrCustomerAddressContaining(String customerName,String address, Pageable pageable);

//   Page<Customer> findCustomerByCustomerPhoneContaining(String customerPhone, Pageable pageable);
}
