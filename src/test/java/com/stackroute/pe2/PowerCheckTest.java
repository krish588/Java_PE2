package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCheckTest {
    private PowerCheck powerCheck;

    @Before
    public void setUp() {
        powerCheck = new PowerCheck();
    }

    @After
    public void tearDown() {
        powerCheck = null;
    }

    @Test
    public void inputNumberChecksForPower() {
        assertEquals("power of 4",powerCheck.checkPower(16));
    }

    @Test
    public void inputNumberChecksForPowerof4() {
        assertEquals("power of 4",powerCheck.checkPower(64));
    }

    @Test
    public void inputNumberChecksNotAPower() {
        assertEquals("not a power",powerCheck.checkPower(33));
    }

    @Test
    public void inputNumberChecksForPowerEquality() {
        assertNotEquals("power of 4",powerCheck.checkPower(100));
    }

    @Test
    public void inputNumberChecksForPowerAndGetsNull() {
        assertNull(powerCheck.checkPower(0));
    }
}
