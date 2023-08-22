package com.hh.service;

import com.hh.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    /**
     * 找到所有
     *
     * @return {@link List}<{@link Book}>
     */
    List<Book> findAll();

    /**
     * 通过id找到书
     *
     * @param id id
     * @return {@link Book}
     */
    Book findBookById(Integer id);

    /**
     * 添加书
     *
     * @param book 书
     * @return int
     */
    boolean addBook(Book book);

    /**
     * 更新书
     *
     * @param book 书
     * @return int
     */
    boolean updateBook(Book book);

    /**
     * 删除书
     *
     * @param id id
     * @return int
     */
    boolean deleteBook(Integer id);
}
