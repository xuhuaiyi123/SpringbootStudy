package com.example.demo1.controller;

import com.example.demo1.entity.User;
import com.example.demo1.utils.JwtUtils;
import com.example.demo1.utils.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @PostMapping("/login")
    public Result login(@RequestBody User user){
        String token = JwtUtils.createToken(user.getUsername());
        return Result.ok().data("token",token);
    }
    @GetMapping("/info")
    public Result info(String token){
        String username = JwtUtils.getClaimsByToken(token).getSubject();
        String url = "https://b0.bdstatic.com/a107a95b57d6ba38bd641a188299f9cc.jpg@h_1280";
        return Result.ok().data("name",username).data("avatar",url);
    }
    @PostMapping("/logout")
    public Result logout(){
        return Result.ok();
    }
}
