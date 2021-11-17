package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.Student;

import java.util.List;

public interface StudentServiceIF {
    List<Student> getAll();
    Student addStudent(Student student);
    String deleteStudent(int UCID);

}
