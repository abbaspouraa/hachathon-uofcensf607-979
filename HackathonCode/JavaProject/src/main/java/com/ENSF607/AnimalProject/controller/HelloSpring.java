package com.ENSF607.AnimalProject.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloSpring {

    @GetMapping("/get")
    public String getData(){
        return "<h1>GetMapping\nfirst api</h1>";
    }

//    @PostMapping("/get")
//    public String postData(@RequestBody Student param){
//        return "PostMapping: " + param.toString();
//    }

    @PutMapping("/get")
    public String PutMapping(){
        return "<h1>PutMapping</h1>";
    }

    @PatchMapping("/get")
    public String PatchMapping(){
        return "PatchMapping";
    }

    @DeleteMapping("/get")
    public String DeleteMapping(){
        return "DeleteMapping";
    }
}
