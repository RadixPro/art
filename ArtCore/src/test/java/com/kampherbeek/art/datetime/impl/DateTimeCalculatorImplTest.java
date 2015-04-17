package com.kampherbeek.art.datetime.impl;

import com.kampherbeek.art.ArtCoreApplication;
import com.kampherbeek.art.datetime.DateTimeCalculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import swisseph.SweDate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = ArtCoreApplication.class,
        loader = SpringApplicationContextLoader.class)
public class DateTimeCalculatorImplTest {

    private final double margin = 0.000000001;
    @Autowired
    private DateTimeCalculator calculator;

    @Test
    public void testGetJNr() {
        SweDate sweDate = new SweDate(1900, 1, 1, 0.0);
        double expected = 2415020.5;
        double actual = calculator.calcJdNr(sweDate);
        assertEquals(expected, actual, margin);
    }


}