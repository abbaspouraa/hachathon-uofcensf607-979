package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> studentList = new ArrayList<>();

    public List<Student> getAll() {
        return studentList;
    }

    public Student addStudent(Student student) {
        studentList.add(student);
        return student;
    }

    public String deleteStudent(int UCID) {

        studentList.removeIf(std -> std.getUcid() == UCID);

        return "Deleted successfully!";
    }
}
