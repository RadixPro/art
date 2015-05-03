package com.kampherbeek.art.endpoints;


import com.kampherbeek.art.domains.positions.BodyPositionService;
import com.kampherbeek.art.domains.positions.model.BodyPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

