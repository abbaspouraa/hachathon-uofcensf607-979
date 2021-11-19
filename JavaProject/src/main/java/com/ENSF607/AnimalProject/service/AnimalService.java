package com.ENSF607.AnimalProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserServiceImpl userServiceImpl;

//    public List<Animal> searchAnimal(Animal animal, String id, String pass) {
//        List<User> u = userServiceImpl.findUser(id, pass);
//        if (u==null || u.size()==0 /*|| u.get(0).getRole().equals("Admin")*/){
//            return null;
//        }
//        String where="";
//
//        String name = animal.getName();
//        String spc = animal.getSpecies();
//        Character sex = animal.getSex();
//
//        if (name!=null && !name.equals(""))
//            where += " AND name LIKE \"%"+name+"%\" ";
//        if (spc!=null && !spc.equals(""))
//            where += " AND Species LIKE \"%"+spc+"%\" ";
//        if (sex!=null && !sex.equals(' '))
//            where += " AND sex=\""+sex+"\" ";
//
//        String query = "SELECT * FROM animal WHERE 1=1 "+where;
//
//        return jdbcTemplate.query(
//                query,
//                new BeanPropertyRowMapper<Animal>(Animal.class)
//        );
//    }
}
