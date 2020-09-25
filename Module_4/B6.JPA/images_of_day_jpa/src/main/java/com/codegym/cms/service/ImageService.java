package com.codegym.cms.service;

import com.codegym.cms.model.Comment;

import java.util.List;


public interface ImageService {
    List<Comment> findAll();

    void save(Comment comment);

    Comment findById(Integer id);

    void update(Comment comment);

    void remove(Integer id);
}
