package com.ENSF607.AnimalProject.model;

import java.sql.Date;

public class OngoingCare {

	Integer CareId;
	Integer UserId;
	Integer AnimalId;
	Date Date;
	String ProcessDescription;
	Double Weight;
	String Drug;
	Date NextDue;
	String Note;
	
	public OngoingCare(Integer careId, Integer userId, Integer animalId, Date date, String processDescription,
			Double weight, String drug, Date nextDue, String note) {
		this.CareId = careId;
		this.UserId = userId;
		this.AnimalId = animalId;
		this.Date = date;
		this.ProcessDescription = processDescription;
		this.Weight = weight;
		this.Drug = drug;
		this.NextDue = nextDue;
		this.Note = note;
	}
	
	public Integer getCareId() {
		return CareId;
	}
	public void setCareId(Integer careId) {
		CareId = careId;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public Integer getAnimalId() {
		return AnimalId;
	}
	public void setAnimalId(Integer animalId) {
		AnimalId = animalId;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public String getProcessDescription() {
		return ProcessDescription;
	}
	public void setProcessDescription(String processDescription) {
		ProcessDescription = processDescription;
	}
	public Double getWeight() {
		return Weight;
	}
	public void setWeight(Double weight) {
		Weight = weight;
	}
	public String getDrug() {
		return Drug;
	}
	public void setDrug(String drug) {
		Drug = drug;
	}
	public Date getNextDue() {
		return NextDue;
	}
	public void setNextDue(Date nextDue) {
		NextDue = nextDue;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	
	
}
