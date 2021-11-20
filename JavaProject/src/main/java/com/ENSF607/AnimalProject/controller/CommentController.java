package com.ENSF607.AnimalProject.controller;

import com.ENSF607.AnimalProject.model.Comment;
import com.ENSF607.AnimalProject.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/addComment")
    public ResponseEntity<Void> addComment(@RequestBody Comment param) {
        commentService.makeComment(param);
        return ResponseEntity.status(HttpURLConnection.HTTP_CREATED).build();
    }
}
