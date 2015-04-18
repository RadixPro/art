package com.kampherbeek.art.datetime.impl;

import com.kampherbeek.art.datetime.DateTimeHandler;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.mockito.Matchers.anyString;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class DateTimeServiceImplTest {
    @Mock
    private DateTimeHandler dateTimeHandlerMock;
    @InjectMocks
    private DateTimeServiceImpl dateTimeService;
    private final double jdnr = 2123456.7;
    private final double margin = 0.000000001;


    @Before
     public void setUp() {when(dateTimeHandlerMock.calculateJdNr(anyString())).thenReturn(jdnr);
    }
    @Test
    public void testGetJdNr() throws Exception {
        assertEquals(jdnr, dateTimeService.getJdNr("2000-01-01 00:00:00"), margin);
    }
}