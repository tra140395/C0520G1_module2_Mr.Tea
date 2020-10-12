package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Comment;
import vn.codegym.repository.ImageRepository;

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
    public Comment findById(int id) {
        return imageRepository.findById(id);
    }

    @Override
    public void update(Comment comment) {
        imageRepository.update(comment);
    }

    @Override
    public void remove(int id) {

    }
}
