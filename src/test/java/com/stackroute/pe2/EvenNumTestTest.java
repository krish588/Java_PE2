package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    EvenNumTest evenNumTest;

    @Before
    public void setUp() {
        evenNumTest = new EvenNumTest();
    }

    @After
    public void tearDown() {
        evenNumTest = null;
    }

    @Test
    public void inputElementChecksForEven() {

        assertEquals(true,evenNumTest.isEven(2));
    }

    @Test
    public void inputElementChecksForEvenReturnsFalse() {

        assertEquals(false,evenNumTest.isEven(3));
    }

    @Test
    public void inputElementChecksForEvenReturnsNotEqual() {

        assertNotEquals(true,evenNumTest.isEven(3));
    }

    @Test
    public void inputElementsChecksForEven(){

        assertNotSame(false,evenNumTest.isEven(8));
    }

}