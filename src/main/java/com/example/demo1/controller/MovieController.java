package com.example.demo1.controller;

import com.example.demo1.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class MovieController {
    @Autowired
    private MovieMapper movieMapper;
    @GetMapping("/movie")
    public List movie(){
        return movieMapper.selectAll();
    }
}
