package com.cc4c.controller;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    public Result doException(Exception ex){
        return new Result();
    }
}
