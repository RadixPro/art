package com.kampherbeek.art.domains.astroadditional.impl;

import com.kampherbeek.art.domains.astroadditional.AstroAdditionalHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AstroAdditionalServiceImplTest {

    private final String jdnrTxt = "2123456.7";
    private final double obliquity = 23.447;
    private final double margin = 0.000000001;
    @Mock
    private AstroAdditionalHandler handlerMock;
    @InjectMocks
    private AstroAdditionalServiceImpl service;

    @Before
    public void setUp() throws Exception {
        when(handlerMock.calcObliquity(anyDouble())).thenReturn(obliquity);
    }

    @Test
    public void testGetObliquity() throws Exception {
        assertEquals(obliquity, service.getObliquity(jdnrTxt), margin);
    }
}
