package com.example.demo1.controller.table;

import com.example.demo1.mapper.PostMappper;
import com.example.demo1.utils.Result;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin
public class ArticleController {
    @Autowired
    private PostMappper postMappper;
    @GetMapping("/article/{id}")
    public Result selectById(int id){
        System.out.println(postMappper.selectById(id));
        return Result.ok().data("article",postMappper.selectById(id));
    }
}
