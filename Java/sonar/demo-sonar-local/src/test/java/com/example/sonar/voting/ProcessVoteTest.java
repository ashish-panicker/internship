package com.example.sonar.voting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProcessVoteTest {

    @Test
    public void testPersonCanVote() {
        Voter voter = new Voter("Rahul", 19);

        assertEquals(true, new ProcessVote().eligibilityToVote(voter));
    }

    @Test
    public void testPersonCannotVote() {
        Voter voter = new Voter("Rahul", 17);

        assertEquals(false, new ProcessVote().eligibilityToVote(voter));
    }

}
