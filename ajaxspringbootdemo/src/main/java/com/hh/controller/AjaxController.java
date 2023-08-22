package com.hh.controller;

import com.hh.domain.Account;
import com.hh.domain.Rest;
import com.hh.domain.RestCode;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ajax")
public class AjaxController {
    @GetMapping
    public Rest getAll(){
        System.out.println("getAll");
        return new Rest(RestCode.SUCCESS_CODE, "success", "获取成功");
    }

    @GetMapping("/{id}")
    public Rest getAllById(@PathVariable Integer id){
        System.out.println("getAllById--->" + id);
        return new Rest(RestCode.SUCCESS_CODE, "success", id);
    }

    @PostMapping
    public Rest add(@RequestBody Account account){
        System.out.println(account);
        return new Rest(RestCode.SUCCESS_CODE, "success", account);
    }
}
