package com.ljf.cwebe.controller;

import com.ljf.cwebe.dao.mapper.DataTestMapper;
import com.ljf.cwebe.dao.model.DataTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    DataTestMapper dataTestMapper;

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response){
        DataTest dataTest = dataTestMapper.selectByPrimaryKey(1);
        logger.info(dataTest.getText());
        return "hello world";
    }

}
