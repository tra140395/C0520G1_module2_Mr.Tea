package com.codegym.cms.service;

import com.codegym.cms.model.Comment;
import com.codegym.cms.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
        return imageRepository.findById(id);
    }

    @Override
    public void update(Comment comment) {
        imageRepository.update(comment);
    }

    @Override
    public void remove(Integer id) {
        imageRepository.remove(id);
    }
}
