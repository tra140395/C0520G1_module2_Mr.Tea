package com.codegym.demo.service.Impl;

import com.codegym.demo.model.NguoiDung;
import com.codegym.demo.repository.NguoiDungRepository;
import com.codegym.demo.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {
    @Autowired
    NguoiDungRepository nguoiDungRepository;

    @Override
    public List<NguoiDung> findAll() {
        return nguoiDungRepository.findAll();
    }
}
