package com.ENSF607.AnimalProject.controller;

import com.ENSF607.AnimalProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/getusernames")
    public List<String> getAllUsername(){
        return userRepository.getAllUserNames();
    }

}
