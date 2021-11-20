package com.ENSF607.AnimalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ENSF607.AnimalProject.model.Animal;
import com.ENSF607.AnimalProject.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	private AnimalService animalService;	
	
	@GetMapping("/getAll")
	public List<Animal> getAllData(){
		return animalService.getAllData();
	}
	
	@GetMapping("/get/{name}")
	public List<Animal> searchByName(@PathVariable String name){
		return animalService.searchByName(name);
	}
	
	@PostMapping("/addAnimal")
    public String addAnimal(@RequestBody Animal animal){
        return animalService.addAnimal(animal);
    }
	
	@PutMapping("/update/{id}")
	public String updateAnimal(@RequestBody Animal animal, @PathVariable Integer id) {
		return animalService.updateAnimal(animal, id);
	}
	
	@DeleteMapping("/delete/{id}")
    public String deleteAnimal(@PathVariable("id") int id){
		return animalService.deleteAnimal(id);
    }
	
	
}
