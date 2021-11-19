package com.ENSF607.AnimalProject.model;

import lombok.Data;

//@Entity
//@Table(name="User")
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public abstract class User {
    public User(){}

    public User(Long userId, String fname, String lname, String role, String email) {
        UserId = userId;
        this.Fname = fname;
        this.Lname = lname;
        this.Role = role;
        this.Email = email;
    }

    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ucid", unique = true)
    Long UserId;

//    @Column(name="fname")
    String Fname;

//    @Column(name="lname")
    String Lname;

//    @NotNull
//    @Column(name="role")
    protected String Role;

//    @Column(name="email")
    String Email;

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
                "fname='" + Fname + '\'' +
                ", UCID=" + UserId +
                '}';
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        this.Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        this.Lname = lname;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        this.Role = role;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
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
        this.UserId = ucid;
    }

//    @Id
    public Long getUcid() {
        return UserId;
    }
}
