package vn.codegym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int score;
    private String author;
    private String comment;
    private int like1;

    public Comment() {
    }

    public Comment(int id, int score, String author, String comment, int like) {
        this.id = id;
        this.score = score;
        this.author = author;
        this.comment = comment;
        this.like1 = like;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
