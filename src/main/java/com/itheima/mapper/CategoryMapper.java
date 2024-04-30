package com.itheima.mapper;

import com.itheima.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {

    //新增分类
    @Insert("insert into category (category_name, category_alias, create_user, create_time, update_time)" +
            " values(#{categoryName},#{categoryAlias},#{createUser},now(),now())")
    void add(Category category);

    //查询当前用户对应的分类
    @Select("select * from category where create_user=#{id}")
    List<Category> list(Integer id);

    //查询id对应的分类信息
    @Select("select * from category where id=#{id}")
    Category findById(Integer id);

    //更改分类信息
    @Update("update category set category_name=#{categoryName}, category_alias=#{categoryAlias}, update_time=now() where id=#{id}")
    void update(Category category);

    //删除分类
    @Delete("delete from category where id=#{id}")
    void delete(Integer id);
}
