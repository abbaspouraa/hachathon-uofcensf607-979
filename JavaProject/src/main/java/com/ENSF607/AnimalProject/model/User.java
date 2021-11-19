package com.ENSF607.AnimalProject.model;

import lombok.Data;

//@Entity
//@Table(name="User")
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class User {
    public User(){}

    public User(Long userId, String password, String fName, String lName, String role, String email) {
        this.userId = userId;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.role = role;
        this.email = email;
    }

    Long userId;
    String password;
    String fName;
    String lName;
    protected String role;
    String email;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
