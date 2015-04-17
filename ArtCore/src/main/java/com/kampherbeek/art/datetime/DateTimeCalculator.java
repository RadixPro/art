package com.kampherbeek.art.datetime;

import org.joda.time.DateTime;
import swisseph.SweDate;

/**
 * Created by jan on 13-4-15.
 */
public interface DateTimeCalculator {

    double calcJdNr(SweDate sweDate);
}
