package com.dkha.test.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dkha.test.entity.Book;
import com.dkha.test.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentDao extends BaseMapper<Student> {

    @Select("select * from student where name = #{name}")
    @Results({
            @Result(property = "books", column = "id", many = @Many(select = "selectBooks"))
    })
    public List<Student> selectByName(String name);

    @Select("select * from s_book, book where s_book.b_id = book.id and s_book.s_id=#{id}")  // 这个id对应下面传入的参数
    public  List<Book> selectBooks(Long id);


    @Insert("insert into student(no, name) values(#{name}, #{no})")
    public int insertOne(Student student);
}
