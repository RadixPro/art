package com.kampherbeek.art.domains.positions.model;


/**
 * DTO for position of Body (or virtual Body like node).<br/>
 * If position is longitude, deviation should be latitude.<br/>
 * If position is right ascension, deviation should be declination.<br/>
 * If position is azimuth, deviation should be altitude.<br/>
 * Distance is the radius vector and will be the same for all coordinate systems.
 * .
 */
public class BodyPosition {
    private double position;
    private double deviation;
    private double distance;
    private double positionSpeed;
    private double deviationSpeed;
    private double distanceSpeed;

    public BodyPosition() {
        // default constructor require for Json handling.
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public double getDeviation() {
        return deviation;
    }

    public void setDeviation(double deviation) {
        this.deviation = deviation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getPositionSpeed() {
        return positionSpeed;
    }

    public void setPositionSpeed(double positionSpeed) {
        this.positionSpeed = positionSpeed;
    }

    public double getDeviationSpeed() {
        return deviationSpeed;
    }

    public void setDeviationSpeed(double deviationSpeed) {
        this.deviationSpeed = deviationSpeed;
    }

    public double getDistanceSpeed() {
        return distanceSpeed;
    }

    public void setDistanceSpeed(double distanceSpeed) {
        this.distanceSpeed = distanceSpeed;
    }
}
