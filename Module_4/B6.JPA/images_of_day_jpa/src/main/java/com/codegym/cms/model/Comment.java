package com.codegym.cms.model;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private int score;
    private String author;
    private String comment;
    private int like1;

    public Comment() {
    }

    public Comment(int score, String author, String comment, int like) {
        this.score = score;
        this.author = author;
        this.comment = comment;
        this.like1 = like;
    }

//    @Override
//    public String toString() {
//        return  String.format("Comment[id=%d, score=%d, author='%s', comment='%s', like1=%d]", id, score,author,comment,like1);
//    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getLike() {
        return like1;
    }

    public void setLike(int like) {
        this.like1 = like;
    }

}
