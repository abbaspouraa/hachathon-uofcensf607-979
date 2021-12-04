package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.Comment;
import com.ENSF607.AnimalProject.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;


    public List<Comment> getAllComments(){
       return commentRepository.findAll();
    }

    public String addComments(Comment comment){
        commentRepository.save(comment);
        return "Successfully added: Comment for animal with Id " + comment.getAnimalid();
    }


}
