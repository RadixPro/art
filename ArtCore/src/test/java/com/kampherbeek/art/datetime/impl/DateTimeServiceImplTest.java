package com.kampherbeek.art.datetime.impl;

import com.kampherbeek.art.datetime.DateTimeHandler;
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
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DateTimeServiceImplTest {
    private final double jdnr = 2123456.7;
    private final double margin = 0.000000001;
    @Mock
    private DateTimeHandler dateTimeHandlerMock;
    @Mock
    private DateTimeConversions dateTimeConversionsMock;
    @Mock
    private SweDate sweDateMock;
    @InjectMocks
    private DateTimeServiceImpl dateTimeService;

    @Before
    public void setUp() {
        when(dateTimeHandlerMock.calculateJdNr(anyObject())).thenReturn(jdnr);
        when(dateTimeConversionsMock.textToSweDate(anyString())).thenReturn(sweDateMock);
    }

    @Test
    public void testGetJdNr() throws Exception {
        assertEquals(jdnr, dateTimeService.getJdNr("2000-01-01 00:00:00"), margin);
    }
}