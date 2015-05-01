package com.kampherbeek.art.positions;

import com.kampherbeek.art.positions.model.Bodies;
import com.kampherbeek.art.positions.model.BodyPosition;
import com.kampherbeek.art.positions.model.CoordinateSystems;


public interface BodyPositionHandler {

    BodyPosition handleBodyPosition(double jdnr, Bodies body, CoordinateSystems coordinateSystem);


}
