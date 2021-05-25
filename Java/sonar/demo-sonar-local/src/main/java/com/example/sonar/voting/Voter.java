package com.example.sonar.voting;

public class Voter {

    private String personName;

    private Integer personAge;

    public Voter(){

    }

    public Voter(String personName, Integer personAge){
        this.personName = personName;
        this.personAge = personAge;
    }
    
    // sample java code for code analysis

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public String getPersonName() {
        return personName;
    }
    
}
