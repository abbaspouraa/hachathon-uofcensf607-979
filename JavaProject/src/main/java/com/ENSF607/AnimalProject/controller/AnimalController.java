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
import com.ENSF607.AnimalProject.repository.AnimalRepository;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	private AnimalRepository animalRepository;	
	
	@GetMapping("/getAll")
	public List<Animal> getAllData(){
		return animalRepository.findAll();
	}
	
	@GetMapping("/get/{name}")
	public List<Animal> searchByName(@PathVariable String name){
		return animalRepository.findByName(name);
	}
	
	@PostMapping("/addAnimal")
    public String addAnimal(@RequestBody Animal animal){
        animalRepository.save(animal);
        return "Successfully added: Animal " + animal.getAnimalId();
    }
	
	@PutMapping("/update/{id}")
	public String updateAnimal(@RequestBody Animal animal, @PathVariable Integer id) {
		Animal a = animalRepository.findByAnimalId(id);
		
		if (a == null) {
			return "Unable to update animal, not found in the database.";
		}
		
		animal.setAnimalId(id);
		animalRepository.save(animal);
		return "Successfully updated: Animal " + animal.getAnimalId();
	}
	
	@DeleteMapping("/delete/{id}")
    public String DeleteMapping(@PathVariable("id") int id){
		animalRepository.deleteById(id);
        return "Successfully deleted: Animal " + id;
    }
	
	
}
