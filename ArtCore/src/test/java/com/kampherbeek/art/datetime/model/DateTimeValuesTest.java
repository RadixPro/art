package com.kampherbeek.art.datetime.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DateTimeValuesTest {

    private final double jdnr = 1.2345;
    private final double margin = 0.000000001;

    @Test
    public void testGetJdNr() throws Exception {
        DateTimeValues values = new DateTimeValues(jdnr);
        assertEquals(jdnr, values.getJdNr(), margin);
    }
}