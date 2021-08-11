package com.xuyang.service.impl;

import com.xuyang.dao.BooksDao;
import com.xuyang.domain.Books;
import com.xuyang.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xu
 * @Description
 * @create 2021-07-28-14:39
 */

@Service("booksService")
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksDao booksDao;

    @Override
    public List<Books> findAll() {
        System.out.println("业务层:查询所有书籍");
        return booksDao.findAll();
    }

    @Override
    public void saveBook(Books books) {

        System.out.println("业务层:保存书籍");
        booksDao.saveBook(books);
    }
}
