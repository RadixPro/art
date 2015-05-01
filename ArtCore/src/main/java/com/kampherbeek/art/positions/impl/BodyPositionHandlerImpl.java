package com.kampherbeek.art.positions.impl;

import com.kampherbeek.art.positions.BodyPositionHandler;
import com.kampherbeek.art.positions.model.Bodies;
import com.kampherbeek.art.positions.model.BodyPosition;
import com.kampherbeek.art.positions.model.CoordinateSystems;
import com.kampherbeek.art.se.SeFrontend;
import org.springframework.stereotype.Component;
import swisseph.SweConst;

/**
 * Handler for the calculation of bodies (planets, sun, moon, nodes etc.)
 */
@Component
public class BodyPositionHandlerImpl implements BodyPositionHandler {
    @Override
    public BodyPosition handleBodyPosition(double jdnr, Bodies body, CoordinateSystems coordinateSystem) {
        int flags = createFlags(coordinateSystem);
        int bodyIndex = body.getId();
        SeFrontend seFrontend = SeFrontend.getInstance();
        double[] calculationResults = seFrontend.calculateBodyPosition(jdnr, bodyIndex, flags);
        return createBodyPosition(calculationResults);
    }


    private int createFlags(CoordinateSystems coordinateSystem) {
        // TODO add flags for topocentric, ayanamsha, heliocentric,
        // TODO handle horizontal positions.
        int flags = 0;
        flags += SweConst.SEFLG_SPEED;
        if (coordinateSystem == CoordinateSystems.EQUATORIAL) {
            flags += SweConst.SEFLG_EQUATORIAL;
        }
        return flags;
    }


    private BodyPosition createBodyPosition(double[] calculationResults) {
        BodyPosition position = new BodyPosition();
        position.setPosition(calculationResults[0]);
        position.setDeviation(calculationResults[1]);
        position.setDistance(calculationResults[2]);
        position.setPositionSpeed(calculationResults[3]);
        position.setDeviationSpeed(calculationResults[4]);
        position.setDistanceSpeed(calculationResults[5]);
        return position;
    }


}




