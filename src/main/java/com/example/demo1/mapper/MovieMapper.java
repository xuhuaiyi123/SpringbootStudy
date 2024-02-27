package com.example.demo1.mapper;

import com.example.demo1.entity.Movie;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface MovieMapper {
    @Select("select * from movie")
    List<Movie> selectAll();
    @Select("select * from movie where id = #{id}")
    Movie selectById(int id);
    @Delete("delete from movie where id = #{id}")
    String deleteById(int id);//返回name
    @Insert("insert into movie (name) values (#{name})")
    String insert(Movie movie);
}
