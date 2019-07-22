package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    MemberVariable memberVariable;

    @Before
    public void setUp() {
        memberVariable = new MemberVariable();
    }

    @After
    public void tearDown()  {
        memberVariable = null;
    }

    @Test
    public void inputGivenToInitialiseVariables() {
        assertEquals("Member{name='Harry Potter', age=30, salary=2500.3}", memberVariable.initialiseVariables("Harry Potter", 30, 2500.3));
    }

    @Test
    public void inputGivenToNotInitialiseVariables() {
        assertNotEquals(" ", memberVariable.initialiseVariables("Adithya", 23, 2000.66));
    }

    @Test
    public void inputGivenToReturnNull() {
        assertNull( memberVariable.initialiseVariables(null, 0, 0));
    }

    @Test
    public void inputGivenToReturnNotNullAsOutput() {
        assertNotNull( memberVariable.initialiseVariables("adi", 29, 0));
    }


}