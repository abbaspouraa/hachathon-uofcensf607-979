package com.ENSF607.AnimalProject.controller;

import com.ENSF607.AnimalProject.model.User;
import com.ENSF607.AnimalProject.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.HttpsURLConnection;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return userService.getAll();
    }

    @PostMapping("/addUser")
    public ResponseEntity<Void> addUser(@RequestBody User user){
        userService.addUser(user);
        return ResponseEntity.status(HttpsURLConnection.HTTP_CREATED).build();
    }
}
