package com.ENSF607.AnimalProject.controller;

import com.ENSF607.AnimalProject.model.Animal;
import com.ENSF607.AnimalProject.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
