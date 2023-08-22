package com.hh.demo.service;

import com.hh.demo.dao.DiskDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiskService {
    @Resource
    DiskDao dao;

    public void add() {
        dao.save();
    }
}