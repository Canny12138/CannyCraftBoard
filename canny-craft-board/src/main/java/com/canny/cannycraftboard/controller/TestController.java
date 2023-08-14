package com.canny.cannycraftboard.controller;

import com.canny.cannycraftboard.entity.Test;
import com.canny.cannycraftboard.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test/{id}")
    public Test getTestById(@PathVariable Integer id){
        System.out.printf(id.toString());
        return testService.getById(id);
    }
}