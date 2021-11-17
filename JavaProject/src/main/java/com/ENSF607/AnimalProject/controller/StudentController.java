package com.ENSF607.AnimalProject.controller;


import com.ENSF607.AnimalProject.model.Student;
import com.ENSF607.AnimalProject.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    final
    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getAll")
    public List<Student> getAllData(){
        return studentService.getAll();
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student param){
        studentService.addStudent(param);
        return "Successfully added: " + param.getUcid();
    }
//
//    @PutMapping("/get")
//    public String PutMapping(){
//        return "<h1>PutMapping</h1>";
//    }
//
//    @PatchMapping("/get")
//    public String PatchMapping(){
//        return "PatchMapping";
//    }

    @GetMapping("/delete/{ucid}")
    public String DeleteMapping(@PathVariable("ucid") int UCID){
        return "Deleted Successfully: " + studentService.deleteStudent(UCID);
    }
}
