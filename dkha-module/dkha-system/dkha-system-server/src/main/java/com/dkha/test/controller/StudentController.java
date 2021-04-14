package com.dkha.test.controller;


import com.dkha.test.entity.Student;
import com.dkha.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Object insert(@RequestBody Student student){
        studentService.save(student);
        return student;
    }

    @GetMapping
    public Object select(){
        List<Student> list = studentService.list();
        return list;
    }

    @PutMapping
    public Object update(@RequestBody Student student){
        boolean b = studentService.updateById(student);
        return b;
    }

    @DeleteMapping("{id}")
    public Object  delete(@PathVariable Long id){
        boolean b = studentService.removeById(id);
        return b;
    }
}
