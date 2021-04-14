package com.dkha.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dkha.test.dao.StudentDao;
import com.dkha.test.entity.Student;
import com.dkha.test.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements StudentService {

}
