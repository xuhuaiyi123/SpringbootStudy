package com.example.demo1.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Posts)实体类
 *
 * @author makejava
 * @since 2024-02-24 15:37:17
 */
public class Post implements Serializable {
    private static final long serialVersionUID = -95672985211310132L;

    private Integer id;

    private String title;

    private String content;

    private String author;

    private Date publicationDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

}

