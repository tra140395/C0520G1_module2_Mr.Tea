package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface DivisionRepository extends JpaRepository<Division,Integer> {
}
