package com.kampherbeek.art.se;

import org.junit.Test;
import swisseph.SweConst;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by jan on 28-4-15.
 */
public class SeFrontendTest {

    private final double jdnr = 2434406.817713;

    @Test
    public void testGetInstance() throws Exception {
        try {
            SeFrontend frontend = SeFrontend.getInstance();
            assertTrue("No exception.", true);
        } catch (Exception e) {
            fail("Unexpected exception.");
        }

    }

    @Test
    public void testCalculateBodyPosition() throws Exception {
        try {
            int bodyIndex = 1;
            int flags = 0;
            flags += SweConst.SEFLG_SPEED;
            SeFrontend frontend = SeFrontend.getInstance();
            double[] positions = frontend.calculateBodyPosition(jdnr, bodyIndex, flags);
            assertTrue("No exception.", true);
        } catch (Exception e) {
            fail("Unexpected exception.");
        }
    }
}