package com.codegym.demo.service;

import com.codegym.demo.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ImageService {
    List<Comment> findAll();

    void save(Comment comment);

    Comment findById(Integer id);

    void update(Comment comment);

    void remove(Integer id);

    Page<Comment> findAll(Pageable pageable);
}
