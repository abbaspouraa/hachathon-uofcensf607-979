package com.ENSF607.AnimalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ENSF607.AnimalProject.model.OngoingCare;
import com.ENSF607.AnimalProject.service.OngoingCareService;

@RestController
@RequestMapping("/ongoingcare")
public class OngoingCareController{

	@Autowired
	OngoingCareService ongoingCareService;
	
	@GetMapping("/get/{id}")
	public List<OngoingCare> searchById(@PathVariable Integer id){
		return ongoingCareService.searchById(id);
	}
	
	@PostMapping("/add")
    public String add(@RequestBody OngoingCare care){
        return ongoingCareService.add(care);
    }
	
}
