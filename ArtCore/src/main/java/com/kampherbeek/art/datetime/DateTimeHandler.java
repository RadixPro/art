package com.kampherbeek.art.datetime;

import org.springframework.stereotype.Component;

/**
 * Handles date and time related calculations.
 */
public interface DateTimeHandler {

    /**
     * Handles calculation for julian data.
     * @param dateTime Date in the format yyyy-mm-dd hh:mm:ss
     * @return calculated Julian Day Number
     * TODO add support for calendar.
     */
    double calculateJdNr(String dateTime);
}
