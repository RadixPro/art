package com.kampherbeek.art.calculators.se.impl;

import com.kampherbeek.art.calculators.se.DateTimeCalculator;
import org.springframework.stereotype.Component;
import swisseph.SweDate;
import swisseph.SwissEph;

import java.io.File;

@Component
public class DateTimeCalculatorImpl implements DateTimeCalculator {

    private final String path = "se" + File.separator;
    private final SwissEph swissEph = new SwissEph(path);

    @Override
    public double calcJdNr(SweDate sweDate) {
        return sweDate.getJulDay();
    }
}
