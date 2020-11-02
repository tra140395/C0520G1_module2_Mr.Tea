package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.Employee;
import com.codegym.casestudy.repository.EmployeeRepository;
import com.codegym.casestudy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void remove(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Page<Employee> findByNameOrBirthdayContaining(String employee_name, Pageable pageable) {
        return employeeRepository.findEmployeeByEmployeeNameContainingOrEmployeeBirthdayContaining(employee_name,employee_name,pageable );
    }
}
