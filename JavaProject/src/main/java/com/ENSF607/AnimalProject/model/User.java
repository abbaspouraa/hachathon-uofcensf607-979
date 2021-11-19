package com.ENSF607.AnimalProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Table(name="User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ucid", unique = true)
    Long ucid;

//    @Column(name="fname")
    String fname;

//    @Column(name="lname")
    String lname;

//    @NotNull
//    @Column(name="role")
    protected String role;

//    @Column(name="email")
    String email;

//    @Column (name = "CREATE_AT", nullable = false, updatable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdAt;

//    @Column (name = "UPDATE_AT", nullable = true)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date updateAt;

//    @PrePersist
//    public void setCreationDate(){
//        this.createdAt = new Date();
//    }

//    @PreUpdate
//    public void setChangeDate(){
//        this.updateAt = new Date();
//    }


    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", UCID=" + ucid +
                '}';
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
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

//    public Date getCreatedAt() {
//        return createdAt;
//    }

//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }

//    public Date getUpdateAt() {
//        return updateAt;
//    }

//    public void setUpdateAt(Date updateAt) {
//        this.updateAt = updateAt;
//    }

    public void setUcid(Long ucid) {
        this.ucid = ucid;
    }

//    @Id
    public Long getUcid() {
        return ucid;
    }
}
