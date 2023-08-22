package com.hh.dao;

import com.hh.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookDao {
    @Select("select * from book")
    List<Book> findAll();

    @Select("select * from book where id = #{id}")
    Book findBookById(Integer id);

    @Insert("insert into book (name, context, price) VALUES (#{name},#{context},#{price})")
    int addBook(Book book);

    @Insert("update book set name = #{name},context = #{context},price = #{price} where id = #{id}")
    int updateBook(Book book);

    @Delete("delete from book where id = #{id}")
    int deleteBook(Integer id);
}
