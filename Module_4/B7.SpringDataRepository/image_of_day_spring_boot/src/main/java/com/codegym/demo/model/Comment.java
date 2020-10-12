package com.codegym.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private int score;
    private String author;
    private String feedback;
    private int like1;

    public Comment() {
    }

    public Comment(int score, String author, String feedback, int like) {
        this.score = score;
        this.author = author;
        this.feedback = feedback;
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

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getLike() {
        return like1;
    }

    public void setLike(int like) {
        this.like1 = like;
    }

}
