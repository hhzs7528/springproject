package com.hh.demo.entity.impl;

import com.hh.demo.entity.Disk;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ConDisk implements Disk {
    @Resource(name = "Context")
    String date;

    @Override
    public void read() {
        System.out.println("ConDisk read : " + date);

    }

    @Override
    public String write() {
        System.out.println("ConDisk write" + date);
        return null;
    }
}
