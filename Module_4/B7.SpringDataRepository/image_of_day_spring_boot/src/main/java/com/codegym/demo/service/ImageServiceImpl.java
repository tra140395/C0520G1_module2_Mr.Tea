package com.codegym.demo.service;

import com.codegym.demo.model.Comment;
import com.codegym.demo.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    ImageRepository imageRepository;

    @Override
    public List<Comment> findAll() {
        return imageRepository.findAll();
    }

    @Override
    public void save(Comment comment) {
        imageRepository.save(comment);
    }

    @Override
    public Comment findById(Integer id) {
        return imageRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Comment comment) {
        imageRepository.save(comment);
    }

    @Override
    public void remove(Integer id) {
        imageRepository.deleteById(id);
    }

    @Override
    public Page<Comment> findAll(Pageable pageable) {
        return imageRepository.findAll(pageable);
    }
}
