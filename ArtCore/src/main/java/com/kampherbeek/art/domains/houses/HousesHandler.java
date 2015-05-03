package com.kampherbeek.art.domains.houses;


import com.kampherbeek.art.domains.houses.model.HouseSystems;
import com.kampherbeek.art.domains.houses.model.Houses;

public interface HousesHandler {

    Houses handleHouses(double jdnr, double geoLat, double geoLong, HouseSystems system);

}


