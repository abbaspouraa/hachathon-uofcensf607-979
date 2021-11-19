package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.Animal;
import com.ENSF607.AnimalProject.model.AnimalStatus;
import com.ENSF607.AnimalProject.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Animal> SearchAnimal(Animal animal) {
        String name = animal.getName();
        String spc = animal.getSpecies();
        Character sex = animal.getSex();
        String query = "SELECT * FROM animal WHERE name = \""
                + name + "\" AND species = \""
                + spc + "\" AND sex = '"
                + sex + '\'';

        return jdbcTemplate.query(
                query,
                new BeanPropertyRowMapper<Animal>(Animal.class)
        );
    }

    public void makeComment(Comment comment){
//        Integer cmntID, Timer date, Integer userID, Integer animalID, String note
        String query = "INSERT INTO comment(CmntId,Date,UserId,AnimalId,Note)\n" +
                "VALUES\n" +
                "(?,?,?,?,?);";
        jdbcTemplate.update(
                query,
                comment.getID(),
                comment.getDate(),
                comment.getUserId(),
                comment.getAnimalId(),
                comment.getNote()
        );
    }

    public List<Comment> seeComments(Integer animalId){
        String query = "SELECT * FROM comment";
        return jdbcTemplate.query(
                query,
                new BeanPropertyRowMapper<Comment>(Comment.class)
                );
    }

    public List<Animal> seeAlertedAnimals(){
        String query = "SELECT * FROM animal WHERE status = \"Alerting\"";
        return jdbcTemplate.query(
                query,
                new BeanPropertyRowMapper<Animal>(Animal.class)
        );
    }

    public List<AnimalStatus> seeAnimalsTreatment(){
        String query = "SELECT * FROM animalstatus";
        return jdbcTemplate.query(
                query,
                new BeanPropertyRowMapper<AnimalStatus>(AnimalStatus.class)
        );
    }
}
