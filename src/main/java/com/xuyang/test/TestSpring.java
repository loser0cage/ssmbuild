package com.xuyang.test;

import com.xuyang.service.BooksService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xu
 * @Description
 * @create 2021-07-28-14:52
 */
public class TestSpring {
    @Test
    public void test1(){
       ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BooksService booksService = (BooksService) context.getBean("booksService");
        booksService.findAll();
    }
}
