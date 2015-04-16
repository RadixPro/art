package com.kampherbeek.art.services.impl;

import com.kampherbeek.art.handlers.DateTimeHandler;
import com.kampherbeek.art.rest.DateTimeController;
import com.kampherbeek.art.services.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DateTimeServiceImpl implements DateTimeService {

    @Autowired
    private DateTimeHandler dateTimeHandler;

    @Override
    public double getJdNr(String dateTime) {

        return dateTimeHandler.calculateJdNr(dateTime);
    }
}
