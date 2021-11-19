package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User addUser(User user);

    void deleteUser(Long id);

}
