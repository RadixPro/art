package com.kampherbeek.art.houses;


import com.kampherbeek.art.houses.model.HouseSystems;
import com.kampherbeek.art.houses.model.Houses;
import org.springframework.beans.factory.annotation.Autowired;



public interface HousesService {

    Houses getHouses(String jdnr, String geoLat, String geoLong, String system);


}
