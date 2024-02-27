package com.example.demo1.entity;

import java.io.Serializable;

/**
 * (Movie)实体类
 *
 * @author makejava
 * @since 2024-02-18 18:01:20
 */
public class Movie implements Serializable {
    private static final long serialVersionUID = 430097399834709410L;

    private Integer id;

    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

