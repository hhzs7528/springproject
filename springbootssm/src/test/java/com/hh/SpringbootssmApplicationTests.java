package com.hh;

import com.hh.domain.Book;
import com.hh.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootssmApplicationTests {

    @Autowired
    private BookService bookService;


    @Test
    public void testApp() {
        for (Book book : bookService.findAll()) {
            System.out.println(book);
        }
    }

}
