package com.hh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.hh.service")
@PropertySource("classpath:jdbc.properties")
@Import({jdbcConfig.class, MybatisConfig.class})
public class SpringConfig {
}
