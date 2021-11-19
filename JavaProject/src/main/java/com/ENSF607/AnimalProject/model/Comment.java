package com.ENSF607.AnimalProject.model;

public class Comment {
    private Integer cmntId;
    private String date;
    private Integer userId;
    private Integer animalId;
    private String note;

    public Comment(){};

    public Comment(Integer cmntId, String date, Integer userId, Integer animalId, String note) {
        this.cmntId = cmntId;
        this.date = date;
        this.userId = userId;
        this.animalId = animalId;
        this.note = note;
    }

    public Integer getCmntId() {
        return cmntId;
    }

    public void setCmntId(Integer cmntId) {
        this.cmntId = cmntId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
