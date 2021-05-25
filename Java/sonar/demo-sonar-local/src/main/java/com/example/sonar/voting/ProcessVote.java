package com.example.sonar.voting;

public class ProcessVote {

    public Boolean eligibilityToVote(Voter v) {
        return (v.getPersonAge() >= 18);
    }

}
