package com.kampherbeek.art.domains.houses.impl;

import com.kampherbeek.art.domains.houses.HousesHandler;
import com.kampherbeek.art.domains.houses.model.HouseSystems;
import com.kampherbeek.art.domains.houses.model.Houses;
import org.junit.Test;

import static org.junit.Assert.*;

public class HousesHandlerImplTest {

    private HousesHandler handler = new HousesHandlerImpl();



    @Test
    public void testHandleHouses() {
        final double jdnr = 123456.77;
        final double geoLat = 44.55;
        final double geoLong = -22.22;
        try {
            Houses houses = handler.handleHouses(jdnr, geoLat, geoLong, HouseSystems.ALCABITIUS);
            assertTrue("No exception ", true);
        } catch (Exception e) {
            fail("Unexpected exception");
        }

    }
}