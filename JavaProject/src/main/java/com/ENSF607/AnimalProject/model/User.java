package com.ENSF607.AnimalProject.model;

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



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", UCID=" + ucid +
                '}';
    }
}
