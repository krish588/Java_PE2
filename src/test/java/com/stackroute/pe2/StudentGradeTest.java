package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {
    StudentGrade studentGrade;

    @Before
    public void setUp() throws Exception {
        studentGrade = new StudentGrade();
    }

    @After
    public void tearDown() throws Exception {
        studentGrade = null;
    }

    @Test
    public void inputDataShouldGiveMinimumMaximumAverage(){
        int[] data = {86,65,98,77};

        assertEquals("StudentGrade{minimum=65, maximum=98, average=81.5}",studentGrade.checkStudentMarks(4,data));
    }

    @Test
    public void inputDataValidatesForNotEquality(){
        int[] data = {86,65,98,77};

        assertNotEquals("StudentGrade{minimum=65, average=81.5}",studentGrade.checkStudentMarks(4,data));
    }

    @Test(expected = ArithmeticException.class)
    public void inputNullValuesGivesError(){

        assertEquals("Invalid inputs",studentGrade.checkStudentMarks(0,null));
    }


}