package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {
    private SalariedEmployee semp1;
    private SalariedEmployee semp2;

    @Before
    public void setUp() {
        semp1 = new SalariedEmployee("Tobi", Date.valueOf("1998-09-01"), 1500.0);
        semp2 = new SalariedEmployee("Tobi", Date.valueOf("1998-09-01"), 1500.0);
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHireDate_sameSalary() {
        semp2.setName("Tobi");
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate_sameSalary() {
        semp2.setHireDate(Date.valueOf("1998-09-01"));

        assertNotEquals(semp1, semp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_sameHireDate_differentSalary() {
        semp2.setSalary(1299.0);

        assertNotEquals(semp1, semp2);
    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
        assertEquals(semp1, semp2);  //assertEquals() for objects does a .equals check
        assertTrue(semp1.equals(semp2)); //alternative
    }

    @Test
    public void testPayTaxes() {
        assertEquals(450.0, semp1.payTaxes(), .001); //30% of salary
    }

    @Test
    public void testPay() {
        assertEquals(1500.0, semp1.pay(), .001);  //just fixed salary
    }
}