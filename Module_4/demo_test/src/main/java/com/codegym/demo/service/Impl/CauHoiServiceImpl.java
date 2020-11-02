package com.codegym.demo.service.Impl;

import com.codegym.demo.model.CauHoi;
import com.codegym.demo.repository.CauHoiRepository;
import com.codegym.demo.service.CauHoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CauHoiServiceImpl implements CauHoiService {
    @Autowired
    CauHoiRepository cauHoiRepository;

    @Override
    public List<CauHoi> findAll() {
        return cauHoiRepository.findAll();
    }

    @Override
    public void save(CauHoi cauHoi) {
        cauHoiRepository.save(cauHoi);
    }

    @Override
    public CauHoi findById(int idCauHoi) {
        return cauHoiRepository.findById(idCauHoi).orElse(null);
    }

    @Override
    public void update(CauHoi cauHoi) {
        cauHoiRepository.save(cauHoi);
    }

    @Override
    public void remove(int idCauHoi) {
        cauHoiRepository.deleteById(idCauHoi);
    }

    @Override
    public Page<CauHoi> findAll(Pageable pageable) {
        return cauHoiRepository.findAll(pageable);
    }

    @Override
    public Page<CauHoi> findByAll(String search, Pageable pageable) {
        return null;
    }
}
