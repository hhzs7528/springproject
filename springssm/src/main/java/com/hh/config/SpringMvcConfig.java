package com.hh.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.hh.controller","com.hh.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
