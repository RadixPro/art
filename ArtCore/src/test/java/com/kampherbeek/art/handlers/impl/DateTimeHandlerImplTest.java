package com.kampherbeek.art.handlers.impl;

import com.kampherbeek.art.calculators.se.DateTimeCalculator;
import com.kampherbeek.art.util.conversions.DateTimeConversions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import swisseph.SweDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DateTimeHandlerImplTest {

    private final String dateTimeText = "2000-01-01 00:00:00";
    private final double jdnr = 2123456.7;
    private final double margin = 0.000000001;
    @Mock
    private DateTimeConversions dateTimeConversionsMock;
    @Mock
    private DateTimeCalculator dateTimeCalculatorMock;
    @Mock
    private SweDate sweDateMock;
    @InjectMocks
    private DateTimeHandlerImpl dateTimeHandler;

    @Before
    public void setUp() throws Exception {
        when(dateTimeConversionsMock.textToSweDate(dateTimeText)).thenReturn(sweDateMock);
        when(dateTimeCalculatorMock.calcJdNr(anyObject())).thenReturn(jdnr);

    }

    @Test
    public void testCalculateJdNr() throws Exception {
        assertEquals(jdnr, dateTimeHandler.calculateJdNr(dateTimeText), margin);
    }


}