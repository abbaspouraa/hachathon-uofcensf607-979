package com.ENSF607.AnimalProject.model;

public class Animal {
	
	Integer AnimalId;
	String Name;
	String Species;
	Character Sex;
	String Breed;
	Integer Age;
	String RFID;
	String Altered;
	Double Weight;
	String Special_Problem;
	String Continuous_Medication;
	String Special_Instructions;
	String Special_Diet;
	String Tatoo;
	String Color;
	String Status;
	Integer BookedId;

	public Animal(String name, String species, Character sex) {
		Name = name;
		Species = species;
		Sex = sex;
	}

	public Animal(){}

	public Animal (String name, Integer id, String species, Character sex, String breed, Integer age, String rfid,
				   String altered, Double weight, String specialProblem, String continuousMedication, String specialInstructions,
				   String specialDiet, String tatoo, String colour, String status, Integer bookedId) {
		this.Name = name;
		this.AnimalId = id;
		this.Species = species;
		this.Sex = sex;
		this.Breed = breed;
		this.Age = age;
		this.RFID = rfid;
		this.Altered = altered;
		this.Weight = weight;
		this.Special_Problem = specialProblem;
		this.Continuous_Medication = continuousMedication;
		this.Special_Instructions = specialInstructions;
		this.Special_Diet = specialDiet;
		this.Tatoo = tatoo;
		this.Color = colour;
		this.Status = status;
		this.BookedId = bookedId;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public Integer getAnimalId() {
		return AnimalId;
	}
	public void setAnimalId(Integer id) {
		this.AnimalId = id;
	}
	public String getSpecies() {
		return Species;
	}
	public void setSpecies(String species) {
		this.Species = species;
	}
	public Character getSex() {
		return Sex;
	}
	public void setSex(Character sex) {
		this.Sex = sex;
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		this.Breed = breed;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		this.Age = age;
	}
	public String getRfid() {
		return RFID;
	}
	public void setRfid(String rfid) {
		this.RFID = rfid;
	}
	public String getAltered() {
		return Altered;
	}
	public void setAltered(String altered) {
		this.Altered = altered;
	}
	public Double getWeight() {
		return Weight;
	}
	public void setWeight(Double weight) {
		this.Weight = weight;
	}
	public String getSpecial_Problem() {
		return Special_Problem;
	}
	public void setSpecial_Problem(String specialProblem) {
		this.Special_Problem = specialProblem;
	}
	public String getContinuous_Medication() {
		return Continuous_Medication;
	}
	public void setContinuous_Medication(String continuousMedication) {
		this.Continuous_Medication = continuousMedication;
	}
	public String getSpecial_Instructions() {
		return Special_Instructions;
	}
	public void setSpecial_Instructions(String specialInstructions) {
		this.Special_Instructions = specialInstructions;
	}
	public String getSpecial_Diet() {
		return Special_Diet;
	}
	public void setSpecial_Diet(String specialDiet) {
		this.Special_Diet = specialDiet;
	}
	public String getTatoo() {
		return Tatoo;
	}
	public void setTatoo(String tatoo) {
		this.Tatoo = tatoo;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String colour) {
		this.Color = colour;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		this.Status = status;
	}
	public Integer getBookedId() {
		return BookedId;
	}
	public void setBookedId(Integer bookedId) {
		this.BookedId = bookedId;
	}
	
}
