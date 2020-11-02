package com.codegym.demo.repository;

import com.codegym.demo.model.LoaiCauHoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiCauHoiRepository extends JpaRepository<LoaiCauHoi,Integer> {
}
