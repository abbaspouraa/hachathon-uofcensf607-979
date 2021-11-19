package com.ENSF607.AnimalProject.model;

import lombok.Data;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Student extends User{

    public Student(){
        super.role ="Student";
    }

}
