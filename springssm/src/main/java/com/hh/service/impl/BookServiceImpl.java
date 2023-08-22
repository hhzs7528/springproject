package com.hh.service.impl;

import com.hh.dao.BookDao;
import com.hh.domain.Book;
import com.hh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao dao;

    @Override
    public List<Book> findAll() {
        return dao.findAll();
    }

    @Override
    public Book findBookById(Integer id) {
        return dao.findBookById(id);
    }

    @Override
    public boolean addBook(Book book) {
        return dao.addBook(book) > 0;
    }

    @Override
    public boolean updateBook(Book book) {
        return dao.updateBook(book) > 0;
    }

    @Override
    public boolean deleteBook(Integer id) {
        return dao.deleteBook(id) > 0;
    }
}
