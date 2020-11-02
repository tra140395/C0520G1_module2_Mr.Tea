package com.codegym.demo.repository;

import com.codegym.demo.model.CauHoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CauHoiRepository extends JpaRepository<CauHoi,Integer> {
}
