package com.kampherbeek.art.domains.astroadditional.impl;

import com.kampherbeek.art.domains.astroadditional.AstroAdditionalCalculator;
import com.kampherbeek.art.domains.astroadditional.AstroAdditionalHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AstroAdditionalHandlerImplTest {

    private final double jdnr = 222333.444;
    private final double margin = 0.000000001;
    private final double obliquity = 23.447;
    @Mock
    private AstroAdditionalCalculator calculatorMock;

    @InjectMocks
    private AstroAdditionalHandler astroAdditionalHandler = new AstroAdditionalHandlerImpl();

    @Before
    public void setUp() throws Exception {
        when(calculatorMock.calcObliquity(anyObject())).thenReturn(obliquity);
    }


    @Test
    public void testCalcObliquity() throws Exception {
        assertEquals(obliquity, astroAdditionalHandler.calcObliquity(jdnr), margin);
    }
}

