package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface PositionRepository extends JpaRepository<Position,Integer> {
}
