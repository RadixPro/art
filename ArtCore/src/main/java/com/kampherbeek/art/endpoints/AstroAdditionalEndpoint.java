package com.kampherbeek.art.endpoints;

import com.kampherbeek.art.domains.astroadditional.AstroAdditionalService;
import com.kampherbeek.art.domains.astroadditional.model.AstroAdditionalValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AstroAdditionalEndpoint {
    @Autowired
    private AstroAdditionalService service;

    @RequestMapping("/astroadditional/obliquity")
    public AstroAdditionalValues getObliquity(@RequestParam("jdnr") final String jdnr) {
        double obliquity = service.getObliquity(jdnr);
        return new AstroAdditionalValues(obliquity);
    }


}

