package com.mvc.demo.model;

public class User {

    private String userName;

    private String password;

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" + " userName='" + getUserName() + "'" + ", password='" + getPassword() + "'" + "}";
    }

}
