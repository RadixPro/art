package com.kampherbeek.art.astroadditional.impl;

import com.kampherbeek.art.astroadditional.AstroAdditionalCalculator;
import org.springframework.stereotype.Component;
import swisseph.SweConst;
import swisseph.SweDate;
import swisseph.SwissEph;

import java.io.File;

/**
 * Several factors that are already included by SE calculations but that might be needed for other calculations.
 */
@Component
public class AstroAdditionalCalculatorImpl implements AstroAdditionalCalculator {

    private final String path = "se" + File.separator;
    private final SwissEph swissEph = new SwissEph(path);

    /**
     * Calculate mean obliquity of the Ecliptic
     *
     * @param sweDate SweDate containing date and time
     * @return value of mean obliquity
     */
    @Override
    public double calcObliquity(SweDate sweDate) {
        double[] values = new double[6];
        StringBuffer errors = new StringBuffer();
        swissEph.swe_calc(sweDate.getJulDay(), SweConst.SE_ECL_NUT, createFiltersLong(), values, errors);
        return values[1];
    }

    private int createFiltersLong() {
        int flags = 0;
        flags = flags | SweConst.SEFLG_SWIEPH;
        return flags;
    }
}
