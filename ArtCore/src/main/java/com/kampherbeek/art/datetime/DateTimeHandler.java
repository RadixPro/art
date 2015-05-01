package com.kampherbeek.art.datetime;

import swisseph.SweDate;

/**
 * Handles date and time related calculations.
 */
public interface DateTimeHandler {

    /**
     * Handles calculation for julian data.
     *
     * @param sweDate time and date.
     * @return calculated Julian Day Number.
     * TODO add support for calendar.
     */
    double calculateJdNr(SweDate sweDate);
}
