package com.kampherbeek.art.domains.houses.impl;

import com.kampherbeek.art.domains.houses.HousesHandler;
import com.kampherbeek.art.domains.houses.HousesService;
import com.kampherbeek.art.domains.houses.model.HouseSystems;
import com.kampherbeek.art.domains.houses.model.Houses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HousesServiceImpl implements HousesService{

    @Autowired
    private HousesHandler handler;

    @Override
    public Houses getHouses(String jdnr, String geoLat, String geoLong, String system) {
        HouseSystems houseSystem = HouseSystems.valueOf(system);
        return handler.handleHouses(Double.parseDouble(jdnr), Double.parseDouble(geoLat), Double.parseDouble(geoLong), houseSystem);
    }
}
