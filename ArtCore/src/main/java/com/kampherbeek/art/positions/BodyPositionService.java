package com.kampherbeek.art.positions;


import com.kampherbeek.art.positions.model.BodyPosition;

public interface BodyPositionService {

    BodyPosition getBodyPosition(String jdnr, String planet, String coordinateSystem);

}
