package com.zmy.controller;

import com.zmy.pojo.Books;
import com.zmy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    //controller层调用service层

    @Autowired
//    @Autowired是按类型自动转配的，不支持id匹配。
//   加上@Qualifier则可以根据byName的方式自动装配
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    @RequestMapping("/deleteBook")
    public String dele(Model model){

        return "allBook";

    }

}
