package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.Animal;
import com.ENSF607.AnimalProject.repository.AnimalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {
	
	@Autowired
    AnimalRepository animalRepository;
	
	public List<Animal> getAllData(){
		return animalRepository.findAll();
	}
	
	public List<Animal> searchByName(String name){
		return animalRepository.findByname(name);
	}

	public String addAnimal(Animal animal){
        animalRepository.save(animal);
        return "Successfully added: Animal " + animal.getAnimalId();
    }
	
	public String updateAnimal(Animal animal, Integer id) {
		Animal a = animalRepository.findByanimalId(id);
		
		if (a == null) {
			return "Unable to update animal, not found in the database.";
		}
		
		animal.setAnimalId(id);
		animalRepository.save(animal);
		return "Successfully updated: Animal " + animal.getAnimalId();
	}
	
	public String deleteAnimal(Integer id){
		animalRepository.deleteById(id);
        return "Successfully deleted: Animal " + id;
    }
}
