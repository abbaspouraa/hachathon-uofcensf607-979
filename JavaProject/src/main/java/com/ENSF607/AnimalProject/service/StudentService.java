package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements StudentServiceIF {

    List<Student> list = new ArrayList<>();

    @Override
    public List<Student> getAll() {
        return list;
    }

    @Override
    public Student addStudent(Student student) {
        list.add(student);
        return student;
    }

    @Override
    public String deleteStudent(int UCID) {

        list.removeIf(std -> std.getUcid() == UCID);

        return "Deleted successfully!";
    }
}
