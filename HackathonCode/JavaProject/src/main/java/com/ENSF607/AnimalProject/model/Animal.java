package com.ENSF607.AnimalProject.model;


import javax.persistence.*;


@Entity
@Table(name = "ANIMAL")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "animalId",
//			nullable = false)
	Integer animalid;
	
//	@Column(name = "name")
	String name;
	
//	@Column(name = "species")
	String species;
	
//	@Column(name = "sex")
	Character sex;
	
//	@Column(name = "breed")
	String breed;
	
//	@Column(name = "age")
	Integer age;
	
//	@Column(name = "rfid")
	String rfid;
	
//	@Column(name = "altered")
	String altered;
	
//	@Column(name = "weight")
	Double weight;
	
//	@Column(name = "specialProblem")
	String specialProblem;
	
//	@Column(name = "continuousMedication")
	String continuousMedication;
	
//	@Column(name = "specialInstructions")
	String specialInstructions;
	
//	@Column(name = "specialDiet")
	String specialDiet;
	
//	@Column(name = "tatoo")
	String tatoo;
	
//	@Column(name = "color")
	String color;
	
//	@Column(name = "status")
	String status;
	
//	@Column(name = "bookedId")
	Integer bookedId;


	public Integer getAnimalid() {
		return animalid;
	}

	public void setAnimalid(Integer animalId) {
		this.animalid = animalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setColor(String color) {
		this.color = color;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getBookedId() {
		return bookedId;
	}

	public void setBookedId(Integer bookedId) {
		this.bookedId = bookedId;
	}
}
