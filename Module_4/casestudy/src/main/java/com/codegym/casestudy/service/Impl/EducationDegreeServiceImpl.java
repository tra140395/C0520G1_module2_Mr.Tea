package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.EducationDegree;
import com.codegym.casestudy.repository.EducationDegreeRepository;
import com.codegym.casestudy.service.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    EducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
