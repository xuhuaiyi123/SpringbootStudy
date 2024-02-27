package com.example.demo1.mapper;

import com.example.demo1.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User selectById(int id);
    @Delete("delete from user where id = #{id}")
    String deleteById(int id);
    @Insert("insert into user (username,password) values (#{username},#{password})")
    String insert(User user);
    @Select("select * from user")
    List<User> selectAll();
}
