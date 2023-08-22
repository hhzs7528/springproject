package com.hh.controller;

import com.hh.domain.Book;
import com.hh.domain.Rest;
import com.hh.domain.RestCode;
import com.hh.exception.BusinessException;
import com.hh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public Rest findAll() {
        if (true) throw new BusinessException(RestCode.BUSINESS_EXCEPTION_CODE, "我在这里抛出了一个BusinessException异常");
        List<Book> all = bookService.findAll();
        if (all == null) {
            return new Rest(RestCode.FAILURE_CODE, "查找失败");
        }
        return new Rest(RestCode.SUCCESS_CODE, "查找成功", all);
    }

    @GetMapping("/{id}")
    public Rest findBookById(@PathVariable Integer id) {
        Book book = bookService.findBookById(id);
        if (book == null) {
            return new Rest(RestCode.FAILURE_CODE, "查找失败");
        }
        return new Rest(RestCode.SUCCESS_CODE, "查找成功", book);
    }

    @PostMapping
    public Rest addBook(@RequestBody Book book) {
        if (bookService.addBook(book)){
            return new Rest(RestCode.SUCCESS_CODE, "添加成功");
        }else {
            return new Rest(RestCode.FAILURE_CODE, "添加失败");
        }
    }

    @PutMapping
    public Rest updateBook(@RequestBody Book book) {
        if (bookService.updateBook(book)){
            return new Rest(RestCode.SUCCESS_CODE, "更新成功");
        }else {
            return new Rest(RestCode.FAILURE_CODE, "更新失败");
        }
    }

    @DeleteMapping("/{id}")
    public Rest deleteBook(@PathVariable Integer id) {
        if (bookService.deleteBook(id)){
            return new Rest(RestCode.SUCCESS_CODE, "删除成功");
        }else {
            return new Rest(RestCode.FAILURE_CODE, "删除失败");
        }
    }
}
