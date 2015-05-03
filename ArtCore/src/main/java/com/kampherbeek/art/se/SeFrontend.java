package com.kampherbeek.art.se;

import swisseph.SwissEph;


public class SeFrontend {

    private static final SeFrontend oneAndOnlyInstance = new SeFrontend();
    private final static String path = "/home/jan/develop/se";   // TODO make filesystem agnostic
    private final SwissEph swissEph = new SwissEph(path);

    private SeFrontend() {
        // prevent direct instantiation.
    }

    /**
     * Get an instance.
     *
     * @return singleton instance of this class.
     */
    public static SeFrontend getInstance() {
        return oneAndOnlyInstance;
    }


    public double[] calculateBodyPosition(double jdnr, int bodyIndex, int flags) {
        double[] results = new double[6];
        swissEph.calc(jdnr, bodyIndex, flags, results);
        return results;
    }

    public double[] calculateHouses(double jdnr, double geoLat, double geoLong, int houseSystem) {
        return domificationFromSe(jdnr, geoLat, geoLong, houseSystem, false);
    }

    public double[] calculateAscMc(double jdnr, double geoLat, double geoLong, int houseSystem) {
        return domificationFromSe(jdnr, geoLat, geoLong, houseSystem, true);
    }

    private double[] domificationFromSe(double jdnr, double geoLat, double geoLong, int houseSystem, boolean additional) {
        double[] cusps = new double[13];
        double[] ascMc = new double[10];
        int flags = 0;
        swissEph.swe_houses(jdnr, flags, geoLat, geoLong, houseSystem, cusps, ascMc);
        if (additional) {
            return ascMc;
        }
        return cusps;
    }


}
