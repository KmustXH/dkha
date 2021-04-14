package com.dkha.test.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dkha.test.entity.Student;

import java.util.List;

public interface StudentService extends IService<Student> {
    List<Student> selectByName(String name);
    Page<Student> selectByPage(Page page);
}
