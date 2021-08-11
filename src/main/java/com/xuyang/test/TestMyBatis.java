package com.xuyang.test;


import com.xuyang.dao.BooksDao;
import com.xuyang.domain.Books;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author xu
 * @Description
 * @create 2021-07-28-17:27
 */
public class TestMyBatis {
    @Test
    public void test() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        BooksDao mapper = session.getMapper(BooksDao.class);
        List<Books> all = mapper.findAll();
        for (Books books : all) {
            System.out.println(books);
        }
        session.close();
        inputStream.close();
    }
    @Test
    public void test2() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        BooksDao mapper = session.getMapper(BooksDao.class);
        Books books = new Books(4, "php", 2, "php无敌");
        mapper.saveBook(books);
        session.commit();
        session.close();
        inputStream.close();
    }
}
