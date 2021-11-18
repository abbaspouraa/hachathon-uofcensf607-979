package com.ENSF607.AnimalProject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ENSF607.AnimalProject.model.Animal;
import com.ENSF607.AnimalProject.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	final AnimalService animalService;
	
	public AnimalController(AnimalService service) {
		this.animalService = service;
	}
	
	@GetMapping("/getAll")
	public List<Animal> getAllData(){
		return animalService.getAll();
	}
	
	@GetMapping("/get/{name}")
	public List<Animal> searchByName(@PathVariable("name") String name){
		return animalService.searchName(name);
	}
	
	@GetMapping("/get/{species}")
	public List<Animal> searchBySpecies(@PathVariable("species") String species){
		return animalService.searchSpecies(species);
	}
	
	@GetMapping("/get/{sex}")
	public List<Animal> searchBySex(@PathVariable("sex") String sex){
		return animalService.searchSex(sex);
	}
	
	@PostMapping("/addAnimal")
    public String addAnimal(@RequestBody Animal param){
        animalService.addAnimal(param);
        return "Successfully added: " + param.getId();
    }
	
	@GetMapping("/delete/{id}")
    public String DeleteMapping(@PathVariable("id") int id){
        return "Deleted Successfully: " + animalService.deleteAnimal(id);
    }
}
