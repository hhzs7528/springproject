package com.hh.config;

import com.hh.controller.interceptor.ProjectInterceptor;
import com.hh.controller.interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Autowired
    private ProjectInterceptor projectInterceptor;
    @Autowired
    private ProjectInterceptor2 projectInterceptor2;
    // 用于配置访问过滤器，用于不让所有资源都进行json化，过滤静态资源
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 配置需要添加静态资源的请求url
        registry.addResourceHandler("/**")
                // 配置需要添加静态资源的请求url
                .addResourceLocations("classpath:/static/","classpath:/templates/");
    }

    //拦截器，拦截动态资源
    //可以配置拦截器链
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor)
                // 配置拦截请求url（ ** 表示拦截所有请求url）
                .addPathPatterns("/books", "/books/*")
                // 排除某些不需要拦截的请求url（即带有/page请求不会被拦截）
                .excludePathPatterns("/page");
        registry.addInterceptor(projectInterceptor2)
                .addPathPatterns("/books", "/books/*")
                .excludePathPatterns("/page");
    }
}
