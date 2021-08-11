package com.xuyang.service;

import com.xuyang.domain.Books;

import java.util.List;

/**
 * @author xu
 * @Description
 * @create 2021-07-28-14:38
 */
public interface BooksService {
    //查询所有书籍
    public List<Books> findAll();
    //保存书籍
    public void saveBook(Books books);
}
