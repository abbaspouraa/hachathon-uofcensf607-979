package com.ENSF607.AnimalProject.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true)
    private Long id;

    @NotNull
    @NotBlank
    @Column(name = "UserId")
    @NotEmpty(message = "UserId is required!")
    private Long userId2;

    @NotNull
    @NotBlank
    @Column(name = "Password")
    @NotEmpty(message = "Password is required!")
    private String password;

    @NotNull
    @NotBlank
    @Column(name = "FName")
    @NotEmpty(message = "First name is required!")
    private String fName;

    @NotNull
    @NotBlank
    @Column(name = "LName")
    @NotEmpty(message = "Last name is required!")
    private String lName;

    @NotNull
    @NotBlank
    @Column(name = "Role")
    @NotEmpty(message = "User role is required!")
    private String role;

    @NotNull
    @NotBlank
    @Column(name = "Email")
    @NotEmpty(message = "Email is required!")
    private String email;

//    @Column(name = "CREATED_AT", nullable = false, updatable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdAt;
//
//    @Column(name = "UPDATED_AT", nullable = true, updatable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date updatedAt;

//    @PrePersist
//    public void setCreatedAt(){
//        this.createdAt = new Date();
//    }
//
//    @PreUpdate
//    public void setUpdatedAt(){
//        this.updatedAt = new Date();
//    }

//    public Long getUserId() {
//        return userId;
//    }

//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId2() {
        return userId2;
    }

    public void setUserId2(Long userId) {
        this.userId2 = userId;
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
