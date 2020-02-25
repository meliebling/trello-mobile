package com.presentation.trello.mobile.models;

public class User {
    private  String username;
    private  String password;

    public User withUsername(String username) {
        this.username = username;
        return this;
    }

    public User withPassword(String password) {
        this.password = password;
        return this;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
