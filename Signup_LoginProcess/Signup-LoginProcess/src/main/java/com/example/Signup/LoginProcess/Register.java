package com.example.Signup.LoginProcess;

import javax.persistence.Entity;

@Entity
public class Register {
    private Long id;
    private String Firstname;
    private String Lastname;
    private String Email;
    private float password;

    public Register() {
    }

    public Register(Long id, String firstname, String lastname, String email, float password) {
        this.id = id;
        Firstname = firstname;
        Lastname = lastname;
        Email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public float getPassword() {
        return password;
    }

    public void setPassword(float password) {
        this.password = password;
    }
}
