package com.kampherbeek.art.util.conversions;

import com.kampherbeek.art.ArtCoreApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import swisseph.SweDate;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = ArtCoreApplication.class,
        loader = SpringApplicationContextLoader.class)
public class DateTimeConversionsTest {

    private final double margin = 0.000000001;

    @Autowired
    DateTimeConversions dateTimeConversions;

    @Test
    public void testTextToSweDate() throws Exception {
        String dateTime = "2015-04-13 22:15:00";
        SweDate expected = new SweDate(2015, 4, 13, 22.25);
        SweDate actual = dateTimeConversions.textToSweDate(dateTime);
        assertEquals(expected.getJulDay(), actual.getJulDay(), margin);
    }

    @Test(expected = InvalidParameterException.class)
    public void testTextToSweDateShortString() throws Exception {
        String dateTime = "2015-04-13 22:15";
        dateTimeConversions.textToSweDate(dateTime);
    }

    @Test(expected = InvalidParameterException.class)
    public void testTextToSweDateWrongDate() throws Exception {
        String dateTime = "2015-04-13 xx:15:00";
        dateTimeConversions.textToSweDate(dateTime);
    }

}