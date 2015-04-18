package com.kampherbeek.art.astroadditional.impl;

import com.kampherbeek.art.astroadditional.AstroAdditionalCalculator;
import com.kampherbeek.art.astroadditional.AstroAdditionalHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import swisseph.SweDate;

/**
 * Additional astronomical calculations.
 */
@Component
public class AstroAdditionalHandlerImpl implements AstroAdditionalHandler{

    @Autowired
    private AstroAdditionalCalculator calculator;

    /**
     * Handle the calculation of obliquity.
     * @param jdnr Julian day number
     * @return obliquity
     */
    @Override
    public double calcObliquity(String jdnr) {
        SweDate sweDate = new SweDate(Double.parseDouble(jdnr));
        return calculator.calcObliquity(sweDate);
    }
}
