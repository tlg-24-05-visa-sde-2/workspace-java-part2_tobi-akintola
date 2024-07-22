package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee emp1;
    private Employee emp2;

    @Before
    public void setUp() {
        emp1 = new SalariedEmployee("Tobi", Date.valueOf("2024-05-07"));
        emp2 = new SalariedEmployee("Tobi", Date.valueOf("2024-05-07"));
    }

    @Test
    public void equals_shouldReturnTrue_sameName_sameHireDate() {
        assertEquals(emp1, emp2);    //does .equals() check for objects
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate() {
        emp2.setHireDate(Date.valueOf("2001-01-01"));  //changes hireDate
        assertNotEquals(emp1, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHireDate() {
        emp2.setName("gianna");                        //changes name
        assertNotEquals(emp1, emp2);
    }
}