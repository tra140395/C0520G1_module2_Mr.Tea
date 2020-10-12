package com.codegym.demo.repository;

import com.codegym.demo.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Comment,Integer> {
}
