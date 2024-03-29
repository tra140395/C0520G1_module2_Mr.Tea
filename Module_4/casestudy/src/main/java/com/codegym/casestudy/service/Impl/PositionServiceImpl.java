package com.codegym.casestudy.service.Impl;

import com.codegym.casestudy.model.Position;
import com.codegym.casestudy.repository.PositionRepository;
import com.codegym.casestudy.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    PositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
