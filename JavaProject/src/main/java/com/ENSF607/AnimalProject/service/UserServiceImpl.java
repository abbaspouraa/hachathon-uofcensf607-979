package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.User;
import com.ENSF607.AnimalProject.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo userRepo;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> getAll(){
        return userRepo.findAll();
    }

    @Override
    public User addUser(User user){
        userRepo.save(user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {

    }

//    public List<User> findUser(String userId, String pass){
//        String query = "SELECT * FROM user WHERE userId=\"" +
//                userId +
//                "\" AND password = \"" +
//                pass + "\";";
//        return jdbcTemplate.query(
//                query,
//                new BeanPropertyRowMapper<User>(User.class)
//        );
//    }

//    public List<Comment> seeComments(Integer animalId){
//        String query = "SELECT * FROM comment";
//        return jdbcTemplate.query(
//                query,
//                new BeanPropertyRowMapper<Comment>(Comment.class)
//                );
//    }
//
//    public List<Animal> seeAlertedAnimals(){
//        String query = "SELECT * FROM animal WHERE status = \"Alerting\"";
//        return jdbcTemplate.query(
//                query,
//                new BeanPropertyRowMapper<Animal>(Animal.class)
//        );
//    }
//
//    public List<AnimalStatus> seeAnimalsTreatment(){
//        String query = "SELECT * FROM animalstatus";
//        return jdbcTemplate.query(
//                query,
//                new BeanPropertyRowMapper<AnimalStatus>(AnimalStatus.class)
//        );
//    }
}
