package com.yzq.service;

import com.yzq.mapper.StudentsMapper;
import com.yzq.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    @Autowired
    private StudentsMapper studentsMapper;
    public void setStudentsMapper(StudentsMapper studentsMapper) {
        this.studentsMapper = studentsMapper;
    }

    public List<Student> getStudents(int id) {
        return studentsMapper.getStudents(id);
    }

    public int addStudent(Student student) {
        return studentsMapper.addStudent(student);
    }
}
