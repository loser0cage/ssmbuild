package com.xuyang.controller;

import com.xuyang.domain.Books;
import com.xuyang.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author xu
 * @Description
 * @create 2021-07-28-14:41
 */
@Controller
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BooksService booksService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层:查询所有账户");
        List<Books> list = booksService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/save")
    public String saveAccount(Books books) {
        booksService.saveBook(books);
        return "list";
    }
}
