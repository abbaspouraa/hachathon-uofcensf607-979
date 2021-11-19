package com.ENSF607.AnimalProject.model;

import java.util.Date;

public class Comment {
    private Integer CmntId;
    private Date Date;
    private Integer UserId;
    private Integer AnimalId;
    private String Note;

    public Comment(){};

    public Comment(Integer cmntId, java.util.Date date, Integer userId, Integer animalId, String note) {
        CmntId = cmntId;
        Date = date;
        UserId = userId;
        AnimalId = animalId;
        Note = note;
    }

    public Integer getCmntId() {
        return CmntId;
    }

    public void setCmntId(Integer cmntId) {
        CmntId = cmntId;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
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

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }
}
