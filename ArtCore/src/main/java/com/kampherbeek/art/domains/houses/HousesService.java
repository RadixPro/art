package com.kampherbeek.art.domains.houses;


import com.kampherbeek.art.domains.houses.model.Houses;


public interface HousesService {

    Houses getHouses(String jdnr, String geoLat, String geoLong, String system);


}
