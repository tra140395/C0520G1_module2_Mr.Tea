package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.Comment;

import java.util.List;

@Service
public interface ImageService {
    List<Comment> findAll();

    void save(Comment comment);

    Comment findById(int id);

    void update(Comment comment);

    void remove(int id);
}
