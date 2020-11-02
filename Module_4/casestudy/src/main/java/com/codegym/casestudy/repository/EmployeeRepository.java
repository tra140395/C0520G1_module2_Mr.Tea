package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Page<Employee> findEmployeeByEmployeeNameContainingOrEmployeeBirthdayContaining(String name,String birthday,Pageable pageable);
}
