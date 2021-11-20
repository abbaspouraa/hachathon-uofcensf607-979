package com.ENSF607.AnimalProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ENSF607.AnimalProject.model.Animal;

@Component
public interface AnimalRepository extends JpaRepository<Animal, Integer>{

	public List<Animal> findByName(String name);
	
	public Animal findByAnimalId(Integer animalId);
}
