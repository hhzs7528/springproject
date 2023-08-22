package com.hh.aopdemo.dao;

import com.hh.aopdemo.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AccountDao {

    @Insert("insert into db_account (email, username) values (#{email},#{username})")
    void save(Account account);

    @Delete("delete from db_account where id = #{id}")
    void delete(Integer id);

    @Update("update db_account set email = #{email},username = #{username} where id = #{id}")
    void update(Account account);

    @Select("select * from db_account")
    List<Account> findAll();

    @Select("select * from db_account where id = #{id}")
    Account findById(Integer id);
}
