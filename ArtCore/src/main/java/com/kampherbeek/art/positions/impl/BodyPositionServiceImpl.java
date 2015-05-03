package com.kampherbeek.art.positions.impl;

import com.kampherbeek.art.positions.BodyPositionHandler;
import com.kampherbeek.art.positions.BodyPositionService;
import com.kampherbeek.art.positions.model.Bodies;
import com.kampherbeek.art.positions.model.BodyPosition;
import com.kampherbeek.art.positions.model.CoordinateSystems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BodyPositionServiceImpl implements BodyPositionService {

    @Autowired
    private BodyPositionHandler handler;

    @Override
    public BodyPosition getBodyPosition(final String jdnrTxt, final String planet, final String coordinateSystemTxt) {
        double jdnr = Double.parseDouble(jdnrTxt);
        Bodies body = Bodies.valueOf(planet);
        CoordinateSystems coordinateSystem = CoordinateSystems.valueOf(coordinateSystemTxt);
        return handler.handleBodyPosition(jdnr, body, coordinateSystem);
    }
}
