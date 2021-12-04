package com.ENSF607.AnimalProject.service;


import com.ENSF607.AnimalProject.model.Animal;
import com.ENSF607.AnimalProject.repository.AnimalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
	
	@Autowired
    AnimalRepository animalRepository;
	
	public List<Animal> getAllData(){
		return animalRepository.findAll();
	}

	public List<Animal> getAnimalsByStatus(String status){
		return animalRepository.findAllBystatus(status);
	}
	
	public List<Animal> searchByName(String name){
		return animalRepository.findByname(name);
	}

	public List<Animal> searchAnimal(String name, String species, String sex){
		return animalRepository.searchAnimal(name,species,sex);
	}

	public String addAnimal(Animal animal){
        animalRepository.save(animal);
        return "Successfully added: Animal " + animal.getAnimalid();
    }
	
	public String updateAnimal(Animal animal, Integer id) {
		Animal a = animalRepository.findByanimalid(id);
		
		if (a == null) {
			return "Unable to update animal, not found in the database.";
		}
		
		animal.setAnimalid(id);
		animalRepository.save(animal);
		return "Successfully updated: Animal " + animal.getAnimalid();
	}
	
	public String deleteAnimal(Integer id){
		animalRepository.deleteById(id);
        return "Successfully deleted: Animal " + id;
    }
}
