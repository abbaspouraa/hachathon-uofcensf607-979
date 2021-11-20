package com.ENSF607.AnimalProject.model;


import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ANIMAL")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "animalId",
			nullable = false)
	Integer animalId;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "species")
	String species;
	
	@Column(name = "sex")
	Character sex;
	
	@Column(name = "breed")
	String breed;
	
	@Column(name = "age")
	Integer age;
	
	@Column(name = "rfid")
	String rfid;
	
	@Column(name = "altered")
	String altered;
	
	@Column(name = "weight")
	Double weight;
	
	@Column(name = "specialProblem")
	String specialProblem;
	
	@Column(name = "continuousMedication")
	String continuousMedication;
	
	@Column(name = "specialInstructions")
	String specialInstructions;
	
	@Column(name = "specialDiet")
	String specialDiet;
	
	@Column(name = "tatoo")
	String tatoo;
	
	@Column(name = "color")
	String color;
	
	@Column(name = "status")
	ArrayList<AnimalStatus> status;
	
	@Column(name = "bookedId")
	Integer bookedId;
	
	public Animal (String name, Integer id, String species, Character sex, String breed, Integer age, String rfid,
			String altered, Double weight, String specialProblem, String continuousMedication, String specialInstructions,
			String specialDiet, String tatoo, String colour, ArrayList<AnimalStatus> status, Integer bookedId) {
		this.name = name;
		this.animalId = id;
		this.species = species;
		this.sex = sex;
		this.breed = breed;
		this.age = age;
		this.rfid = rfid;
		this.altered = altered;
		this.weight = weight;
		this.specialProblem = specialProblem;
		this.continuousMedication = continuousMedication;
		this.specialInstructions = specialInstructions;
		this.specialDiet = specialDiet;
		this.tatoo = tatoo;
		this.color = colour;
		this.status = status;
		this.bookedId = bookedId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAnimalId() {
		return animalId;
	}
	public void setAnimalId(Integer id) {
		this.animalId = id;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public String getAltered() {
		return altered;
	}
	public void setAltered(String altered) {
		this.altered = altered;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getSpecialProblem() {
		return specialProblem;
	}
	public void setSpecialProblem(String specialProblem) {
		this.specialProblem = specialProblem;
	}
	public String getContinuousMedication() {
		return continuousMedication;
	}
	public void setContinuousMedication(String continuousMedication) {
		this.continuousMedication = continuousMedication;
	}
	public String getSpecialInstructions() {
		return specialInstructions;
	}
	public void setSpecialInstructions(String specialInstructions) {
		this.specialInstructions = specialInstructions;
	}
	public String getSpecialDiet() {
		return specialDiet;
	}
	public void setSpecialDiet(String specialDiet) {
		this.specialDiet = specialDiet;
	}
	public String getTatoo() {
		return tatoo;
	}
	public void setTatoo(String tatoo) {
		this.tatoo = tatoo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String colour) {
		this.color = colour;
	}
	public ArrayList<AnimalStatus> getStatus() {
		return status;
	}
	public void setStatus(ArrayList<AnimalStatus> status) {
		this.status = status;
	}
	public Integer getBookedId() {
		return bookedId;
	}
	public void setBookedId(Integer bookedId) {
		this.bookedId = bookedId;
	}
	
}
