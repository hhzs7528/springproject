package com.hh.demo.dao;

import com.hh.demo.entity.Disk;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DiskDao {

    public void save() {
        System.out.println("保存用户信息到数据库！");
    }
}
