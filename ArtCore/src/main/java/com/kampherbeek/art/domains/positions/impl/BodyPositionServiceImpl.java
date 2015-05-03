package com.kampherbeek.art.domains.positions.impl;

import com.kampherbeek.art.domains.positions.BodyPositionHandler;
import com.kampherbeek.art.domains.positions.BodyPositionService;
import com.kampherbeek.art.domains.positions.model.Bodies;
import com.kampherbeek.art.domains.positions.model.BodyPosition;
import com.kampherbeek.art.domains.positions.model.CoordinateSystems;
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
