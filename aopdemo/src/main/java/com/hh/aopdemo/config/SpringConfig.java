package com.hh.aopdemo.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.hh.aopdemo")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
