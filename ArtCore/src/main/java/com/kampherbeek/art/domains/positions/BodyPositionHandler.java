package com.kampherbeek.art.domains.positions;

import com.kampherbeek.art.domains.positions.model.Bodies;
import com.kampherbeek.art.domains.positions.model.BodyPosition;
import com.kampherbeek.art.domains.positions.model.CoordinateSystems;


public interface BodyPositionHandler {

    BodyPosition handleBodyPosition(double jdnr, Bodies body, CoordinateSystems coordinateSystem);


}
