package com.kampherbeek.art.datetime.impl;

import com.kampherbeek.art.datetime.DateTimeCalculator;
import com.kampherbeek.art.datetime.DateTimeHandler;
import com.kampherbeek.art.util.conversions.DateTimeConversions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import swisseph.SweDate;

@Component
public class DateTimeHandlerImpl implements DateTimeHandler {

    @Autowired
    private DateTimeConversions dateTimeConversions;
    @Autowired
    private DateTimeCalculator dateTimeCalculator;
    @Override
    public double calculateJdNr(String dateTime) {
        SweDate sweDate = dateTimeConversions.textToSweDate(dateTime);
        return dateTimeCalculator.calcJdNr(sweDate);
    }
}
