package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.Animal;
import com.ENSF607.AnimalProject.model.AnimalStatus;
import com.ENSF607.AnimalProject.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;

//    ArrayList<Comment> commentList;
//    ArrayList<Animal> animalList;
//    ArrayList<AnimalStatus> animalStatusesList;

    //    password??
    public List<Comment> SearchAnimal(String name, String spc, Character sex) {
        String query = "";
        return jdbcTemplate.query(
                query,
                new BeanPropertyRowMapper<>(Animal.class)
        );
    }


    public void makeComment(Comment comment){
//        Time time, Integer ucid, Integer animalId, String comment
        commentList.add(comment);
    }

    public List<Comment> seeComments(Integer animalId){
        String query = "SELECT * FROM COMMENT";
        return jdbcTemplate.query(
                query,
                new BeanPropertyRowMapper<Comment>(Comment.class)
                );
    }

    public List<Animal> seeAlertedAnimals(){
        ArrayList<Animal> animalQuery = new ArrayList<Animal>(0);
        for (Animal anm:animalList){
            if (anm.getStatus().equals("Alerting")){
                animalQuery.add(anm);
            }
        }
        return animalQuery;
    }

    ArrayList<AnimalStatus> seeAnimalsTreatment(){
        return animalStatusesList;
    }
}
