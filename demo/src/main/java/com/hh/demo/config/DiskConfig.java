package com.hh.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiskConfig {

    @Bean
    public  String Context(){
        return "hello spring";
    }

    @Bean
    public String usbContext(){
        return "usb hello spring";
    }
}
