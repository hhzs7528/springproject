package com.hh.aopdemo;

import com.hh.aopdemo.config.SpringConfig;
import com.hh.aopdemo.domain.Account;
import com.hh.aopdemo.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService service = ctx.getBean(AccountService.class);
        Account account = service.findById(1);

    }
}
