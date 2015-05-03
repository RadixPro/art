package com.kampherbeek.art.domains.positions;


import com.kampherbeek.art.domains.positions.model.BodyPosition;

public interface BodyPositionService {

    BodyPosition getBodyPosition(String jdnr, String planet, String coordinateSystem);

}
