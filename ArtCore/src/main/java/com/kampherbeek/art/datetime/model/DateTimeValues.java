package com.kampherbeek.art.datetime.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DateTimeValues {

    private double jdNr;

    public DateTimeValues(double jdNr) {
        this.jdNr = jdNr;
    }

    public DateTimeValues() {
        // needs default constructor
    }

    public double getJdNr() {
        return jdNr;
    }

}
