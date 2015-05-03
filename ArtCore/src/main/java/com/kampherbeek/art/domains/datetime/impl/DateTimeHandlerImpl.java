package com.kampherbeek.art.domains.datetime.impl;

import com.kampherbeek.art.domains.datetime.DateTimeCalculator;
import com.kampherbeek.art.domains.datetime.DateTimeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import swisseph.SweDate;

@Component
public class DateTimeHandlerImpl implements DateTimeHandler {


    @Autowired
    private DateTimeCalculator dateTimeCalculator;

    @Override
    public double calculateJdNr(SweDate sweDate) {

        return dateTimeCalculator.calcJdNr(sweDate);
    }
}
