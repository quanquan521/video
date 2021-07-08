package com.yzq.mapper;

import com.yzq.pojo.Student;

import java.util.List;

public interface StudentsMapper {
      List<Student> getStudents(int id);
      int  addStudent(Student student);
}
