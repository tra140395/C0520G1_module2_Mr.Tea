package com.codegym.test.service.SeviceImpl;

import com.codegym.test.model.ProductType;
import com.codegym.test.repository.ProductTypeRepository;
import com.codegym.test.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    ProductTypeRepository productTypeRepository;
    @Override
    public List<ProductType> findAll() {
        return productTypeRepository.findAll();
    }
}
