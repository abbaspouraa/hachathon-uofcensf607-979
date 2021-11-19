package com.ENSF607.AnimalProject.controller;


import com.ENSF607.AnimalProject.model.Animal;
import com.ENSF607.AnimalProject.model.Comment;
import com.ENSF607.AnimalProject.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.HttpURLConnection;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    final
    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getAllAnimals")
    public List<Animal> getAllData(@RequestBody Animal param){
        return studentService.SearchAnimal(param);
    }

    @PostMapping("/addComment")
    public ResponseEntity<Void> addComment(@RequestBody Comment param){
        studentService.makeComment(param);
        return ResponseEntity.status(HttpURLConnection.HTTP_CREATED).build();
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

//    @GetMapping("/delete/{ucid}")
//    public String DeleteMapping(@PathVariable("ucid") int UCID){
//        return "Deleted Successfully: " + studentService.deleteStudent(UCID);
//    }
}
