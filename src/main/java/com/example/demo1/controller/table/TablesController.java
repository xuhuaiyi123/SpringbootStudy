package com.example.demo1.controller.table;

import com.example.demo1.entity.Post;
import com.example.demo1.mapper.PostMappper;
import com.example.demo1.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/table")
@CrossOrigin
public class TablesController {
    @Autowired
    private PostMappper postMappper;
    @GetMapping("/list")
    public Result table() {
    List<Post> list = postMappper.selectAll();
    return Result.ok().data("items",list);
    }
}

