package com.codegym.cms.repository;

import com.codegym.cms.model.Comment;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
public class ImageRepositoryImpl implements ImageRepository {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Comment> findAll() {
        TypedQuery<Comment> query = em.createQuery("select c from Comment c",Comment.class);
        return query.getResultList();
    }

    @Override
    public Comment findById(Integer id) {
        TypedQuery<Comment> query = em.createQuery("select c from Comment c where c.id=:id", Comment.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void remove(Integer id) {
        Comment comment = findById(id);
        if (comment != null){
            em.remove(comment);
        }
    }

    @Override
    public void update(Comment comment) {
        em.merge(comment);
    }

    @Override
    public void save(Comment model) {
        if(model.getId() != null){
            em.merge(model);
        }else {
            em.persist(model);
        }
    }
}
