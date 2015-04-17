package com.kampherbeek.art.datetime.impl;

import com.kampherbeek.art.datetime.DateTimeCalculator;
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
