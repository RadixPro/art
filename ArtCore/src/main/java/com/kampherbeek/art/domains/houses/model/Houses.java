package com.kampherbeek.art.domains.houses.model;

import java.util.Map;


public class Houses {

    private HouseSystems houseSystem;
    private double mc;
    private double ascendant;
    private Map<Integer, Double> cusps;



    public Houses() {
        // empty constructor to support JSON.
    }

    public HouseSystems getHouseSystem() {
        return houseSystem;
    }

    public void setHouseSystem(HouseSystems houseSystem) {
        this.houseSystem = houseSystem;
    }

    public double getMc() {
        return mc;
    }

    public void setMc(double mc) {
        this.mc = mc;
    }

    public double getAscendant() {
        return ascendant;
    }

    public void setAscendant(double ascendant) {
        this.ascendant = ascendant;
    }

    public Map<Integer, Double> getCusps() {
        return cusps;
    }

    public void setCusps(Map<Integer, Double> cusps) {
        this.cusps = cusps;
    }
}
