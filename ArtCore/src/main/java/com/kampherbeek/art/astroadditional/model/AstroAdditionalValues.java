package com.kampherbeek.art.astroadditional.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Description of values for additional astronomical calculations.
 * Mainly used to construct a json structure.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AstroAdditionalValues {

    private double obliquity;

    public AstroAdditionalValues() {
        // default constructor required for Json handling.
    }

    public AstroAdditionalValues(double obliquity) {
        this.obliquity = obliquity;
    }

    public double getObliquity() {
        return obliquity;
    }
}
