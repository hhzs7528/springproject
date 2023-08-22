package com.hh.controller;

import com.hh.domain.Rest;
import com.hh.domain.RestCode;
import com.hh.exception.BusinessException;
import com.hh.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    //系统问题
    @ExceptionHandler(SystemException.class)
    public Rest doSystemException(SystemException e){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员，ex对象发送给开发人员
        return new Rest(e.getCode(), e.getMessage());
    }

    //业务问题
    @ExceptionHandler(BusinessException.class)
    public Rest doBusinessException(BusinessException e){
        return new Rest(e.getCode(), e.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public Rest doException(Exception e){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员，ex对象发送给开发人员
        return new Rest(RestCode.FAILURE_CODE, "系统繁忙，请稍后再试！");
    }
}
