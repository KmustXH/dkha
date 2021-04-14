package com.dkha.test.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dkha.test.dao.StudentDao;
import com.dkha.test.entity.Student;
import com.dkha.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> selectByName(String name) {
        return studentDao.selectByName(name);
    }

    @Override
    public Page<Student> selectByPage(Page page) {
        Page page1 = studentDao.selectPage(page, null);
        return page1;
    }
}
