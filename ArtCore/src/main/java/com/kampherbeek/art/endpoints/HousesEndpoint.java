package com.kampherbeek.art.endpoints;

import com.kampherbeek.art.houses.HousesService;
import com.kampherbeek.art.houses.model.Houses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HousesEndpoint {
    @Autowired
    private HousesService service;

    @RequestMapping("/houses")
    public Houses getHouses(@RequestParam("jdnr") final String jdnr,
                            @RequestParam("system") final String system,
                            @RequestParam("geoLat") final String geoLat,
                            @RequestParam("geoLong") final String geoLong) {
        return service.getHouses(jdnr, geoLat, geoLong, system);
    }
}


/*

@RestController
public class PositionsEndpoint {
    @Autowired
    private BodyPositionService service;

    @RequestMapping("/positions/body")
    public BodyPosition getBodyPosition(@RequestParam("jdnr") final String jdnr,
                                        @RequestParam("body") final String planet,
                                        @RequestParam("coordinatesystem") final String coordinateSystem) {
        return service.getBodyPosition(jdnr, planet, coordinateSystem);
    }

}


 */