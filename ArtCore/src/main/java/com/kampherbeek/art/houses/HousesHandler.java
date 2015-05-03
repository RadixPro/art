package com.kampherbeek.art.houses;


import com.kampherbeek.art.houses.model.HouseSystems;
import com.kampherbeek.art.houses.model.Houses;

public interface HousesHandler {

    Houses handleHouses(double jdnr, double geoLat, double geoLong, HouseSystems system);

}


