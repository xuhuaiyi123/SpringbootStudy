package com.example.demo1.mapper;

import com.example.demo1.entity.Post;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PostMappper {
    /**
     * 查询所有帖子
     * @return 帖子列表
     */
    @Select("select * from posts")
    List<Post> selectAll();

    /**
     * 根据id查询帖子
     * @param id 帖子id
     * @return 查询到的帖子
     */
    @Select("select * from posts where id = #{id}")
    Post selectById(int id);

    /**
     * 根据标题查询帖子
     * @param title 帖子标题
     * @return 查询到的帖子
     */
    @Select("select * from posts where title = #{title}")
    Post selectByTitle(String title);

    /**
     * 根据id删除帖子
     * @param id 帖子id
     * @return 删除结果
     */
    @Delete("delete from posts where id = #{id}")
    String deleteById(int id);

}
