package com.ENSF607.AnimalProject.service;


import com.ENSF607.AnimalProject.model.Animal;
import com.ENSF607.AnimalProject.repository.AnimalRepository;

import javassist.NotFoundException;
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

	public Animal getAnimalById(Integer id){
		return animalRepository.findByanimalid(id);
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

    //don't forget to update other variables
	public Animal updateAnimalStatus(Integer id, String status) throws NotFoundException {
		Animal theAnimal = animalRepository.findByanimalid(id);
		
		if (theAnimal == null) {
			throw new NotFoundException("Such animal does not exist!");
		}
		
		theAnimal.setStatus(status); // updating status
		return animalRepository.save(theAnimal);
	}
	
	public String deleteAnimal(Integer id){
		animalRepository.deleteById(id);
        return "Successfully deleted: Animal " + id;
    }
}
