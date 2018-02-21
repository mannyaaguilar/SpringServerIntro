package com.manny.blueberrymuffin.model;

import java.time.LocalDate;

public class User {

    private String name;
    private String userName;
    private LocalDate dateCreated;

    public User(String name, String userName, LocalDate dateCreated) {
        this.name = name;
        this.userName = userName;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}
