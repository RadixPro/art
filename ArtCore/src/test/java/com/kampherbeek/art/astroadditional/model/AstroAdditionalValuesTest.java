package com.kampherbeek.art.astroadditional.model;

import org.junit.Test;

import static org.junit.Assert.*;


public class AstroAdditionalValuesTest {
    private final double margin = 0.000000001;
    private final double obliquity = 23.447;

    @Test
    public void testGetObliquity() throws Exception {
        AstroAdditionalValues values = new AstroAdditionalValues(obliquity);
        assertEquals(obliquity, values.getObliquity(), margin);
    }
}

