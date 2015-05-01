package com.kampherbeek.art.positions.impl;

import com.kampherbeek.art.positions.BodyPositionHandler;
import com.kampherbeek.art.positions.model.Bodies;
import com.kampherbeek.art.positions.model.BodyPosition;
import com.kampherbeek.art.positions.model.CoordinateSystems;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BodyPositionHandlerImplTest {


    private BodyPositionHandler handler = new BodyPositionHandlerImpl();

    @Test
    public void testHandleBodyPositionEliptical() throws Exception {
        try {
            double jdnr = 123456.66;
            BodyPosition position = handler.handleBodyPosition(jdnr, Bodies.JUPITER, CoordinateSystems.ECLIPTICAL);
            assertTrue("No exception thrown.", true);
        } catch (Exception e) {
            fail("Unexpected error : " + e.getMessage());
        }
    }

    @Test
    public void testHandleBodyPositionEquatorial() throws Exception {
        try {
            double jdnr = 123456.66;
            BodyPosition position = handler.handleBodyPosition(jdnr, Bodies.JUPITER, CoordinateSystems.EQUATORIAL);
            assertTrue("No exception thrown.", true);
        } catch (Exception e) {
            fail("Unexpected error : " + e.getMessage());
        }
    }

}