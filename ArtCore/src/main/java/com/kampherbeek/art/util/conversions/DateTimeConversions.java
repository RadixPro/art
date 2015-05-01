package com.kampherbeek.art.util.conversions;

import org.springframework.stereotype.Component;
import swisseph.SweDate;

import java.security.InvalidParameterException;


@Component
public class DateTimeConversions {

    private final static int LENGTH_DATE_TIME = 19;
    private final static double SECONDS_PER_MINUTE = 60.0;
    private final static double SECONDS_PER_HOUR = 3600.0;


    /**
     * Converts textual date to a date in Swiss Ephemeris format.
     *
     * @param dateTime the text to convert, format should be yyyy-mm-dd hh:mm:ss C, C means calendar and should be 'G' (Gregorian), 'J' (Julian) or ' A' (automatic).
     * @return the converted date
     */
    public SweDate textToSweDate(String dateTime) {
        SweDate sweDate;
        if (dateTime.length() != LENGTH_DATE_TIME) {
            throw new InvalidParameterException("Incomplete dateTime: " + dateTime);
        }
        try {
            int year = Integer.parseInt(dateTime.substring(0, 4));
            int month = Integer.parseInt(dateTime.substring(5, 7));
            int day = Integer.parseInt(dateTime.substring(8, 10));
            int hour = Integer.parseInt(dateTime.substring(11, 13));
            int minute = Integer.parseInt(dateTime.substring(14, 16));
            int second = Integer.parseInt(dateTime.substring(17));
            double ut = hour + minute / SECONDS_PER_MINUTE + second / SECONDS_PER_HOUR;

            sweDate = new SweDate(year, month, day, ut);

        } catch (NumberFormatException e) {
            throw new InvalidParameterException("Invalid dateTime: " + dateTime);
        }
        return sweDate;
    }


}
