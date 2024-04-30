package com.itheima.service;

import com.itheima.pojo.Article;
import com.itheima.pojo.PageBean;

public interface ArticleService {
    //新增文章
    void add(Article article);

    //条件分页列表查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);

    //获取文章详情
    Article detail(Integer id);

    //更新文章
    void update(Article article);

    //删除文章
    void delete(Integer id);
}
