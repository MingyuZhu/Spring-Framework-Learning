package com.zmy.service;

import com.zmy.dao.BookMapper;
import com.zmy.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {
    //service层调用dao层
    private BookMapper bookMapper;

    //创建set方法传递dao接口，spring也需要通过set方法调用
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBooks();
    }
}
