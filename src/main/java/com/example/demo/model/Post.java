package com.example.demo.model;

import jakarta.persistence.*;

import java.io.*;
import java.util.Date;
@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post(){}

    public Post(final Long id, final String text, final Date creationDate){
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public Long getId(){return id;}
    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setLikes(Integer likes){
        this.likes = likes;
    }
}
