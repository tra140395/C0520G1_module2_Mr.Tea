package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface EducationDegreeRepository extends JpaRepository<EducationDegree,Integer> {
}
