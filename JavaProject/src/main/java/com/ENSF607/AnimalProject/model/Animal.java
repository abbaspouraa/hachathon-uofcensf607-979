package com.ENSF607.AnimalProject.model;

import java.util.ArrayList;

public class Animal {
	
	Integer id;
	String name;
	String species;
	Character sex;
	String breed;
	Integer age;
	String rfid;
	String altered;
	Double weight;
	String specialProblem;
	String continuousMedication;
	String specialInstructions;
	String specialDiet;
	String tatoo;
	String cityTatoo;
	String colour;
	ArrayList<AnimalStatus> status;
	
	public Animal (String name, Integer id, String species, Character sex, String breed, Integer age, String rfid,
			String altered, Double weight, String specialProblem, String continuousMedication, String specialInstructions,
			String specialDiet, String tatoo, String cityTatoo, String colour, ArrayList<AnimalStatus> status) {
		this.name = name;
		this.id = id;
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
		this.cityTatoo = cityTatoo;
		this.colour = colour;
		this.status = status;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getCityTatoo() {
		return cityTatoo;
	}
	public void setCityTatoo(String cityTatoo) {
		this.cityTatoo = cityTatoo;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public ArrayList<AnimalStatus> getStatus() {
		return status;
	}
	public void setStatus(ArrayList<AnimalStatus> status) {
		this.status = status;
	}	
	
	
}
