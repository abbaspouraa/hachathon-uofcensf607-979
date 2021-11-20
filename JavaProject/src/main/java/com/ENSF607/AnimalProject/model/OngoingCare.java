package com.ENSF607.AnimalProject.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ONGOING_CARE")
public class OngoingCare {
	
//	@Column(name = "careId")
	Integer careid;
	
//	@Column(name = "userId")
	Integer userid;
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "animalId",
//			nullable = false)
	Integer animalid;
	
//	@Column(name = "date")
	Date date;
	
//	@Column(name = "processDescription")
	String processdescription;
	
//	@Column(name = "weight")
	Double weight;
	
//	@Column(name = "drug")
	String drug;
	
//	@Column(name = "nextDue")
	Date nextdue;
	
//	@Column(name = "note")
	String note;
	
	public Integer getCareid() {
		return careid;
	}
	public void setCareid(Integer careId) {
		this.careid = careId;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userId) {
		this.userid = userId;
	}
	public Integer getAnimalid() {
		return animalid;
	}
	public void setAnimalid(Integer animalId) {
		this.animalid = animalId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getProcessdescription() {
		return processdescription;
	}
	public void setProcessdescription(String processDescription) {
		this.processdescription = processDescription;
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
	public Date getNextdue() {
		return nextdue;
	}
	public void setNextdue(Date nextDue) {
		this.nextdue = nextDue;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
