package com.dkha.test.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

    @PostMapping
    public Object insert(){
        return "insert";
    }

    public Object select(){
        return "select";
    }

    public Object update(){
        return "unpdate";
    }

    public Object  delete(){
        return "delete";
    }
}
