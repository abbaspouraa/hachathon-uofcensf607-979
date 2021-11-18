package com.ENSF607.AnimalProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ENSF607.AnimalProject.model.Animal;


@Service
public class AnimalService {

	List<Animal> list = new ArrayList<>();
	
    public List<Animal> getAll() {
        return list;
    }

    public Animal addAnimal(Animal animal) {
        list.add(animal);
        return animal;
    }

    public String deleteAnimal(int animalID) {

        list.removeIf(std -> std.getId() == animalID);

        return "Deleted successfully!";
    }
    
    public List<Animal> searchName(String name){
    	List<Animal> matches = new ArrayList<>();
    	
    	for(Animal a: list) {
    		if(a.getName().equals(name)) {
    			matches.add(a);
    		}
    	}
    	
    	return matches;
    }
    
    public List<Animal> searchSpecies(String species){
    	List<Animal> matches = new ArrayList<>();
    	
    	for(Animal a: list) {
    		if(a.getSpecies().equals(species)) {
    			matches.add(a);
    		}
    	}
    	
    	return matches;
    }
    
    public List<Animal> searchSex(String sex){
    	List<Animal> matches = new ArrayList<>();
    	
    	for(Animal a: list) {
    		if(a.getSex().equals(sex)) {
    			matches.add(a);
    		}
    	}
    	
    	return matches;
    }
}
