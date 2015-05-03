package com.kampherbeek.art.domains.houses.impl;

import com.kampherbeek.art.domains.houses.HousesHandler;
import com.kampherbeek.art.domains.houses.model.HouseSystems;
import com.kampherbeek.art.domains.houses.model.Houses;
import com.kampherbeek.art.se.SeFrontend;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class HousesHandlerImpl implements HousesHandler {
    @Override
    public Houses handleHouses(double jdnr, double geoLat, double geoLong, HouseSystems system) {
        SeFrontend seFrontend = SeFrontend.getInstance();
        int systemId = (int) system.getSeId().charAt(0);
        double[] cusps;
        if (system != HouseSystems.NONE) {
            cusps = seFrontend.calculateHouses(jdnr, geoLat, geoLong, systemId);
        } else {
            cusps = new double[0];
        }
        double[] ascMc = seFrontend.calculateAscMc(jdnr, geoLat, geoLong, systemId);
        return createHouses(system, cusps, ascMc);
    }


    private Houses createHouses(HouseSystems system, double[] cusps, double[] ascMc) {
        Houses houses = new Houses();
        houses.setHouseSystem(system);
        houses.setCusps(createOrderedCusps(cusps));
        houses.setAscendant(ascMc[0]);
        houses.setMc(ascMc[1]);
        return houses;
    }

    private Map<Integer, Double> createOrderedCusps(double[] cusps) {
        Map<Integer, Double> orderedCusps = new HashMap<>();
        for (int i = 1; i < cusps.length; i++) {
            orderedCusps.put(i, cusps[i]);
        }
        return orderedCusps;
    }


}
