package com.hh.demo.entity.impl;

import com.hh.demo.entity.Disk;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UsbDisk implements Disk {

    @Resource(name = "usbContext")
    String date;

    @Override
    public void read() {
        System.out.println("UsbDisk read : " + date);

    }

    @Override
    public String write() {
        System.out.println("UsbDisk write" + date);
        return null;
    }
}
