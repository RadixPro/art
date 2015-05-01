package com.kampherbeek.art.astroadditional.impl;

import com.kampherbeek.art.astroadditional.AstroAdditionalHandler;
import com.kampherbeek.art.astroadditional.AstroAdditionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Service for additional astronomical calculations.
 */
@Component
public class AstroAdditionalServiceImpl implements AstroAdditionalService {

    @Autowired
    private AstroAdditionalHandler handler;

    /**
     * Retrieve obliquity
     *
     * @param jdnr Julian day number
     * @return obliquity
     */
    @Override
    public double getObliquity(String jdnr) {
        return handler.calcObliquity(Double.parseDouble(jdnr));
    }
}
