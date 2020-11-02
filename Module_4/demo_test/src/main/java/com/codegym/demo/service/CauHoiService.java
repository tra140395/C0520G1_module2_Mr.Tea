package com.codegym.demo.service;

import com.codegym.demo.model.CauHoi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CauHoiService {
    List<CauHoi> findAll();

    void save(CauHoi cauHoi);

    CauHoi findById(int idCauHoi);

    void update(CauHoi cauHoi);

    void remove(int idCauHoi);

    Page<CauHoi> findAll(Pageable pageable);

    Page<CauHoi> findByAll(String search,Pageable pageable);
}
