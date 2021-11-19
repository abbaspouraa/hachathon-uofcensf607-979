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
    AnimalService animalService;

    @GetMapping("/getAllAnimals/{userID}/{userPass}")
    public ResponseEntity<List<Animal>> getAllAnimal(
            @RequestParam(value = "animalName", required = false) String name,
            @RequestParam(value = "animalSex", required = false) String sex,
            @RequestParam(value = "specie", required = false) String spc,
            @PathVariable("userID") String id,
            @PathVariable("userPass") String pass) {
        Animal param = new Animal(name, spc, sex==null? null:sex.charAt(0));
        return ResponseEntity.status(HttpStatus.OK).body(animalService.searchAnimal(param, id, pass));
    }

//	final AnimalService animalService;

//	public AnimalController(AnimalService service) {
//		this.animalService = service;
//	}
//
//	@GetMapping("/getAll")
//	public List<Animal> getAllData(){
//		return animalService.getAll();
//	}
//
//	@GetMapping("/get/{name}")
//	public List<Animal> searchByName(@PathVariable("name") String name){
//		return animalService.searchName(name);
//	}
//
//	@GetMapping("/get/{species}")
//	public List<Animal> searchBySpecies(@PathVariable("species") String species){
//		return animalService.searchSpecies(species);
//	}
//
//	@GetMapping("/get/{sex}")
//	public List<Animal> searchBySex(@PathVariable("sex") String sex){
//		return animalService.searchSex(sex);
//	}
//
//	@PostMapping("/addAnimal")
//    public String addAnimal(@RequestBody Animal param){
//        animalService.addAnimal(param);
//        return "Successfully added: " + param.getId();
//    }
//
//	@GetMapping("/delete/{id}")
//    public String DeleteMapping(@PathVariable("id") int id){
//        return "Deleted Successfully: " + animalService.deleteAnimal(id);
//    }
}
