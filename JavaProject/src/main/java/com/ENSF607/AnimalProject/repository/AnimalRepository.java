package com.ENSF607.AnimalProject.repository;

import com.ENSF607.AnimalProject.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer>{

	List<Animal> findByname(String name);
	
	Animal findByanimalid(Integer animalId);

	List<Animal> findAllBystatus(String status);
}
