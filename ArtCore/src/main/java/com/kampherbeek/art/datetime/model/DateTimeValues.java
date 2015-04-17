package com.kampherbeek.art.datetime.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DateTimeValues {

    private String jdNr;

    public DateTimeValues(String jdNr) {
        this.jdNr = jdNr;
    }

    public DateTimeValues() {
        // needs default cnstructor
    }

    public String getJdNr() {
        return jdNr;
    }

}
