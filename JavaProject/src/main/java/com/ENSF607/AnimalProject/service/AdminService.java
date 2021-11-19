package com.ENSF607.AnimalProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ENSF607.AnimalProject.model.User;

@Service
public class AdminService {

	@Autowired
	JdbcTemplate template;
	
	public List<User> getAll() {
        return template.query("SELECT * FROM USER", new BeanPropertyRowMapper<User>(User.class));
    }
	
	public User addUser(User user) {
		template.update("INSERT INTO USER (UserID, FName, LName, Email, Role) VALUES (?, ?, ?, ?, ?)", 
				new Object[] {user.getUserID(), user.getFName(), user.getLName(), user.getEmail(), user.getRole()});
		return user;
	}
	
	
}
