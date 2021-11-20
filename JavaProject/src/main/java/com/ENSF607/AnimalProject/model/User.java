package com.ENSF607.AnimalProject.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
    private Long id;

    @NotNull
    @NotBlank
    @Column(unique = true)
    @NotEmpty(message = "UserId is required!")
    private Long userid;

//    @NotNull
//    @NotBlank
//    @Column(name = "Password")
//    @NotEmpty(message = "Password is required!")
    private String password;

//    @NotNull
//    @NotBlank
//    @Column(name = "FName")
//    @NotEmpty(message = "First name is required!")
    private String fName;

//    @NotNull
//    @NotBlank
//    @Column(name = "LName")
//    @NotEmpty(message = "Last name is required!")
    private String lName;

//    @NotNull
//    @NotBlank
//    @Column(name = "Role")
//    @NotEmpty(message = "User role is required!")
    private String role;

//    @NotNull
//    @NotBlank
//    @Column(name = "Email")
//    @NotEmpty(message = "Email is required!")
    private String email;

    @Column(name = "CREATED_AT", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "UPDATED_AT", nullable = true, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @PrePersist
    public void setCreatedAt(){
        this.createdAt = new Date();
    }

    @PreUpdate
    public void setUpdatedAt(){
        this.updatedAt = new Date();
    }


    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userId) {
        this.userid = userId;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId=" + userid +
                ", password='" + password + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
