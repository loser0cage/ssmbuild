package com.xuyang.dao;

import com.xuyang.domain.Books;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.io.PrintWriter;
import java.util.List;

/**
 * @author xu
 * @Description
 * @create 2021-07-28-14:31
 */
@Repository
public interface BooksDao {
    //查询所有书籍
    @Select("select * from books")
    public List<Books> findAll();
    //保存书籍
    @Insert("insert into books values(#{bookID},#{bookName},#{bookCounts},#{detail})")
    public void saveBook(Books books);


}
