package com.ENSF607.AnimalProject.controller;

import com.ENSF607.AnimalProject.model.User;
import com.ENSF607.AnimalProject.service.UserServiceImpl;
import io.swagger.v3.oas.annotations.Parameter;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;
import javax.net.ssl.HttpsURLConnection;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/getAll/{ucid}/{pass}")
    public ResponseEntity<List<User>> getAllUser(
            @PathVariable Long ucid,
            @PathVariable String pass
    ) throws AuthenticationException {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAll(ucid, pass));
    }

    @PostMapping("/addUser/{ucid}/{pass}")
    public ResponseEntity<User> addUser(
            @RequestBody User user,
            @PathVariable Long ucid,
            @PathVariable String pass
    ) throws AuthenticationException {
        return ResponseEntity.status(HttpsURLConnection.HTTP_CREATED).body(userService.addUser(user, ucid, pass));
    }

    @DeleteMapping("/{ucid}/{pass}")
    public ResponseEntity<Void> deleteUser(
            @Parameter Long deletedUcid,
            @PathVariable Long ucid,
            @PathVariable String pass
    ) throws AuthenticationException, NotFoundException {
        userService.deleteUser(deletedUcid, ucid, pass);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/updateUser/{ucid}/{pass}")
    public ResponseEntity<User> updateUser(
            User user,
            @PathVariable Long ucid,
            @PathVariable String pass
    ) throws NotFoundException, AuthenticationException {

        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(user, ucid, pass));
    }

}
