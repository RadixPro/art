package com.kampherbeek.art.datetime.impl;

import com.kampherbeek.art.datetime.DateTimeCalculator;
import com.kampherbeek.art.datetime.DateTimeHandler;
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
