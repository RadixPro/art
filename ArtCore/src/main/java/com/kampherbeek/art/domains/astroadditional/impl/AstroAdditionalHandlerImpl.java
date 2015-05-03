package com.kampherbeek.art.domains.astroadditional.impl;

import com.kampherbeek.art.domains.astroadditional.AstroAdditionalCalculator;
import com.kampherbeek.art.domains.astroadditional.AstroAdditionalHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import swisseph.SweDate;

/**
 * Additional astronomical calculations.
 */
@Component
public class AstroAdditionalHandlerImpl implements AstroAdditionalHandler {

    @Autowired
    private AstroAdditionalCalculator calculator;

    /**
     * Handle the calculation of obliquity.
     *
     * @param jdnr Julian day number
     * @return obliquity
     */
    @Override
    public double calcObliquity(double jdnr) {
        SweDate sweDate = new SweDate(jdnr);
        return calculator.calcObliquity(sweDate);
    }
}
