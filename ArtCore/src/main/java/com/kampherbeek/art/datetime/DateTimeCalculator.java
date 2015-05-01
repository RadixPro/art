package com.kampherbeek.art.datetime;

import swisseph.SweDate;

/**
 * Date and time related calculations.
 */
public interface DateTimeCalculator {

    /**
     * Calculates Julian Day Number
     *
     * @param sweDate Date in the format yyyy-mm-dd hh:mm:ss
     * @return calculated Julian Day Number
     * TODO add support for calendar.
     */
    double calcJdNr(SweDate sweDate);
}
