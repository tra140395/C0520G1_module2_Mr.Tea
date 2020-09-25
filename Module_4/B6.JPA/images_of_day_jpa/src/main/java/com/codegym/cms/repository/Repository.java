package com.codegym.cms.repository;


import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    void save(T t);

    T findById(Integer id);

    void update(T t);

    void remove(Integer id);
}
