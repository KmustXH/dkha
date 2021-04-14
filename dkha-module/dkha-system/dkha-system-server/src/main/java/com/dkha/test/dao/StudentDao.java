package com.dkha.test.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dkha.test.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao extends BaseMapper<Student> {
}
