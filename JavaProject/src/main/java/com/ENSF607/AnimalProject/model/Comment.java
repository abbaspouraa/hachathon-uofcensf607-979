package com.ENSF607.AnimalProject.model;

import javax.persistence.*;

@Entity
@Table(name="COMMENT")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cmntid;

    private String date;
    private Integer userid;
    private Integer animalid;
    private String note;

    public Integer getCmntid() {
        return cmntid;
    }

    public void setCmntid(Integer cmntid) {
        this.cmntid = cmntid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAnimalid() {
        return animalid;
    }

    public void setAnimalid(Integer animalid) {
        this.animalid = animalid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
