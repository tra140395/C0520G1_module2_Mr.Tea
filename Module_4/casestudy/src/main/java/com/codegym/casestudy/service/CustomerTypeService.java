package com.codegym.casestudy.service;

import com.codegym.casestudy.model.CustomerType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerTypeService {
    List<CustomerType> findAll();
}
