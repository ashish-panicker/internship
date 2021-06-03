package com.rest.demo.restdemo1.model;

public class Trainee {

    private Integer id;

    private String email;

    private String name;

    private String serviceLine;

    public Trainee() {
    }

    public Trainee(Integer id, String email, String name, String serviceLine) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.serviceLine = serviceLine;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceLine() {
        return serviceLine;
    }

    public void setServiceLine(String serviceLine) {
        this.serviceLine = serviceLine;
    }

}
