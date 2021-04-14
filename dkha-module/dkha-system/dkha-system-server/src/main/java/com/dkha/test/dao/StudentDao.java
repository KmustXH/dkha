package com.dkha.test.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dkha.test.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentDao extends BaseMapper<Student> {

//    @Select("select * from student where name = #{name}")
    public List<Student> selectByName(String name);

    @Insert("insert into student(no, name) values(#{name}, #{no})")
    public int insertOne(Student student);
}
