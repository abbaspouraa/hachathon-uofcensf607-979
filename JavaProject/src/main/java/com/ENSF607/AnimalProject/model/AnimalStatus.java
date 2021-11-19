package com.ENSF607.AnimalProject.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data

public class AnimalStatus {
    private Integer statusId;
    private Integer careAttId;
    private Integer animalId;
    private Date date;
    private String processDes;
    private Integer temp;
    private Integer weight;
    private Integer heartRate;
    private String symptoms;
    private String diagnosedDrug;
    private Integer vetId;

    public AnimalStatus(Integer statusId, Integer careAttId,
                        Integer animalId, Date date, String processDes,
                        Integer temp, Integer weight, Integer heartRate,
                        String symptoms, String diagnosedDrug, Integer vetId) {
        this.statusId = statusId;
        this.careAttId = careAttId;
        this.animalId = animalId;
        this.date = date;
        this.processDes = processDes;
        this.temp = temp;
        this.weight = weight;
        this.heartRate = heartRate;
        this.symptoms = symptoms;
        this.diagnosedDrug = diagnosedDrug;
        this.vetId = vetId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getCareAttId() {
        return careAttId;
    }

    public void setCareAttId(Integer careAttId) {
        this.careAttId = careAttId;
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

    public String getProcessDes() {
        return processDes;
    }

    public void setProcessDes(String processDes) {
        this.processDes = processDes;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosedDrug() {
        return diagnosedDrug;
    }

    public void setDiagnosedDrug(String diagnosedDrug) {
        this.diagnosedDrug = diagnosedDrug;
    }

    public Integer getVetId() {
        return vetId;
    }

    public void setVetId(Integer vetId) {
        this.vetId = vetId;
    }
}
