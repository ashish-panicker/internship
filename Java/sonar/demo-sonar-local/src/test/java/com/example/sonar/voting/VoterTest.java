package com.example.sonar.voting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VoterTest {


    @Test
    public void testPersonName(){
        Voter v = new Voter();
        v.setPersonName("Rahul");
        assertEquals("Rahul", v.getPersonName());
    }

    @Test
    public void testPersonAge(){
        Voter v = new Voter();
        v.setPersonAge(20);
        assertEquals(Integer.valueOf(20), v.getPersonAge());
    }
    
}
