package com.kampherbeek.art.astroadditional.impl;

import com.kampherbeek.art.astroadditional.AstroAdditionalHandler;
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
public class AstroAdditionalServiceImplTest {

    @Mock
    private AstroAdditionalHandler handlerMock;
    @InjectMocks
    private AstroAdditionalServiceImpl service;
    private final String jdnrTxt = "2123456.7";
    private final double obliquity = 23.447;
    private final double margin = 0.000000001;


    @Before
    public void setUp() throws Exception {
        when(handlerMock.calcObliquity(anyString())).thenReturn(obliquity);
    }

    @Test
    public void testGetObliquity() throws Exception {
        assertEquals(obliquity, service.getObliquity(jdnrTxt), margin);
    }
}
