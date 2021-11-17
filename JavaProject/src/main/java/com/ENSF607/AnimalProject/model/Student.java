package com.ENSF607.AnimalProject.model;

public class Student extends User{

    private String name;

    public int getUcid() {
        return ucid;
    }

    public void setUcid(int ucid) {
        this.ucid = ucid;
    }

    private int ucid;

    public String getName() {
        return name;
    }

    // get animal information

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", UCID=" + ucid +
                '}';
    }
}
