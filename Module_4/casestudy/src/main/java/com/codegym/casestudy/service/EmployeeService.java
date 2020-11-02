package com.codegym.casestudy.service;

import com.codegym.casestudy.model.Customer;
import com.codegym.casestudy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    List<Employee> findAll();

    void save(Employee employee);

    Employee findById(Integer id);

    void update(Employee employee);

    void remove(Integer id);

    Page<Employee> findAll(Pageable pageable);

    Page<Employee> findByNameOrBirthdayContaining(String employee_name,Pageable pageable);
}
