package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {
    private HourlyEmployee hemp;

    @Before
    public void setUp() {
        hemp = new HourlyEmployee("Gianna", Date.valueOf("2020-02-02"), 37.50, 25.0 );
    }

    @Test
    public void testPayTaxes() {
        assertEquals(234.375, hemp.payTaxes(), .001);
    }

    @Test
    public void testPay() {
        assertEquals(937.5, hemp.pay(), .001);
    }
}