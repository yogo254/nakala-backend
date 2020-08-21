package com.yogo.nakalabackend.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Person
 */
@Entity
public class Person {
    @Id
    private String id;
    private String name;
    private String password;
    private String salt;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}