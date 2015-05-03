package com.kampherbeek.art.houses.model;


/**
 * Enum for HouseSystems. The value for seId corresponds with the indexes as used by the Swiss Ephemeris.
 */
public enum HouseSystems {
    NONE("!", 0, false, false),
    PLACIDUS("P", 12, true, true),
    KOCH("K", 12, true, true),
    PORPHYRI("O", 12, true, true),
    REGIOMONTANUS("R", 12, true, true),
    CAMPANUS("C", 12, true, true),
    EQUAL("A", 12, false, true),           // SE also supports "E".
    VEHLOW("V", 12, false, false),
    WHOLESIGN("W", 12, false, false),
    AXIAL("X", 12, true, false),
    HORIZON("H", 12, true, true),
    TOPOCENTRIC("T", 12, true, true),
    ALCABITIUS("B", 12, true, true),
    MORIN("M", 12, false, false),
    KRUSINSKI("K", 12, true, true),
    APC("Y", 12, true, true);


    private final String seId;
    private final int nrOfCusps;
    private final boolean mcEq10;
    private final boolean ascEq10;

    HouseSystems(final String seId, final int nrOfCusps, final boolean mcEq10, final boolean ascEq10) {
        this.seId = seId;
        this.nrOfCusps = nrOfCusps;
        this.mcEq10 = mcEq10;
        this.ascEq10 = ascEq10;
    }


    public String getSeId() {
        return seId;
    }

    public int getNrOfCusps() {
        return nrOfCusps;
    }

    public boolean isMcEq10() {
        return mcEq10;
    }

    public boolean isAscEq10() {
        return ascEq10;
    }

}
