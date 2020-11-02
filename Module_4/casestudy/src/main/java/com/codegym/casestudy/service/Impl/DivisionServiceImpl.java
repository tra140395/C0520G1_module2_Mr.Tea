package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.Division;
import com.codegym.casestudy.repository.DivisionRepository;
import com.codegym.casestudy.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
