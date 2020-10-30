package com.codegym.demo.service.Impl;

import com.codegym.demo.model.LoaiCauHoi;
import com.codegym.demo.repository.LoaiCauHoiRepository;
import com.codegym.demo.service.LoaiCauHoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiCauHoiServiceImpl implements LoaiCauHoiService {
    @Autowired
    LoaiCauHoiRepository loaiCauHoiRepository;
    @Override
    public List<LoaiCauHoi> findAll() {
        return loaiCauHoiRepository.findAll();
    }
}
