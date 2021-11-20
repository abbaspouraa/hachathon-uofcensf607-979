package com.ENSF607.AnimalProject.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "ONGOING_CARE")
public class OngoingCare {
	
	@Id
	@Column(name = "careId",
			nullable = false)
	Integer careId;
	
	@Column(name = "userId",
			nullable = false)	
	Integer userId;
	
	@Id
	@Column(name = "animalId",
			nullable = false)
	Integer animalId;
	
	@Column(name = "date",
			nullable = false)
	Date date;
	
	@Column(name = "processDescription",
			nullable = false)
	String processDescription;
	
	@Column(name = "weight")
	Double weight;
	
	@Column(name = "drug")
	String drug;
	
	@Column(name = "nextDue")
	Date nextDue;
	
	@Column(name = "note")
	String note;
	
	public OngoingCare(Integer careId, Integer userId, Integer animalId, Date date, String processDescription,
			Double weight, String drug, Date nextDue, String note) {
		this.careId = careId;
		this.userId = userId;
		this.animalId = animalId;
		this.date = date;
		this.processDescription = processDescription;
		this.weight = weight;
		this.drug = drug;
		this.nextDue = nextDue;
		this.note = note;
	}
	
	public Integer getCareId() {
		return careId;
	}
	public void setCareId(Integer careId) {
		this.careId = careId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getAnimalId() {
		return animalId;
	}
	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProcessDescription() {
		return processDescription;
	}
	public void setProcessDescription(String processDescription) {
		this.processDescription = processDescription;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getDrug() {
		return drug;
	}
	public void setDrug(String drug) {
		this.drug = drug;
	}
	public Date getNextDue() {
		return nextDue;
	}
	public void setNextDue(Date nextDue) {
		this.nextDue = nextDue;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
}
