package com.ENSF607.AnimalProject.controller;

import com.ENSF607.AnimalProject.model.Animal;
import com.ENSF607.AnimalProject.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {


	@Autowired
	private AnimalService animalService;

//	@CrossOrigin(origins = "http://localhost:8090")
	@GetMapping("/getAll")
	public ResponseEntity<List<Animal>> getAllData(){
		return ResponseEntity.status(HttpStatus.OK).body(animalService.getAllData());
	}

	@GetMapping("/getByStatus")
	public ResponseEntity<List<Animal>> getAllByStatus(){
		return ResponseEntity.status(HttpStatus.OK).body(animalService.getAnimalsByStatus("Healthy"));
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
	
	@GetMapping("/{name}/{species}/{sex}")
	public ResponseEntity<List<Animal>> searchAnimal(@PathVariable(required = false) String name,
													 @PathVariable(required = false) String species,
													 @PathVariable(required = false) String sex){
		return ResponseEntity.status(HttpStatus.OK).body(animalService.searchAnimal(name, species, sex));
	}
}
