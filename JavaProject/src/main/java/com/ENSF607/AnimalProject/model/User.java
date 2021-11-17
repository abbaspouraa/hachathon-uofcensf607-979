package com.ENSF607.AnimalProject.model;

import java.sql.Time;
import java.util.ArrayList;

public abstract class User {
    String name;
    Integer ucid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUcid() {
        return ucid;
    }

    public void setUcid(Integer ucid) {
        this.ucid = ucid;
    }

    //    password??
    public ArrayList<Animal> SearchAnimal(String name, String spc, Character sex){
        return null;
    }

    public void makeComment(Time time,Integer ucid, Integer animalId, String comment){

    }

    public ArrayList<Comment> seeComments(Integer animalId){
        return null;
    }

    ArrayList<Animal> seeAlertedAnimals(){
        return null;
    }

    ArrayList<Animal> seeAnimalsTreatment(){
        return null;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", UCID=" + ucid +
                '}';
    }
}
