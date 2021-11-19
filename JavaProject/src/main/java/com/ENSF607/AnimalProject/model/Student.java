package com.ENSF607.AnimalProject.model;

import lombok.Data;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Student extends User{

    public Student(){
        super.Role ="Student";
    }

    public Student(Long userId, String Fname, String Lname, String role, String email) {
        super(userId, Fname, Lname, "Student", email);
    }
}
