package com.ljf.cwebe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {

//    @Value("${env}")
//    private String env;

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response){
        return "hello world";
    }

}
