package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void makeComment(Comment comment){
//        Integer cmntID, Timer date, Integer userID, Integer animalID, String note
//        String query = "SET FOREIGN_KEY_CHECKS=0; " +
//                "INSERT INTO comment(CmntId,Date,UserId,AnimalId,Note) " +
//                "VALUES (?,?,?,?,?); " +
//                "SET FOREIGN_KEY_CHECKS=1";

        String query = " INSERT INTO comment(cmntId,date,userId,animalId,Note) VALUES (?,?,?,?,?);";

//        jdbcTemplate.update(query);

        jdbcTemplate.update(
                query,
                comment.getCmntId(),
                comment.getDate(),
                comment.getUserId(),
                comment.getAnimalId(),
                comment.getNote()
        );
    }
}
