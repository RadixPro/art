package com.kampherbeek.art.domains.positions.model;

/**
 * Enum for planets and other bodies and positional points.<br/>
 * The keys and values for the enum correspond to the values as used in the Swiss Ephemeris.
 * However, the prefix <i>SE_</i> is removed from the keys.<br/>
 * Not all possibilities are implemented yet.
 */
public enum Bodies {

    SUN(0),
    MOON(1),
    MERCURY(2),
    VENUS(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9),
    MEAN_NODE(10),
    TRUE_NODE(11),
    MEAN_APOG(12),
    OSCU_APOG(13),
    EARTH(14),
    CHIRON(15),
    PHOLUS(16),
    CERES(17),
    PALLAS(18),
    JUNO(19),
    VESTA(20),
    INTP_APOG(21),
    INTP_PERG(22);

    private final int id;

    Bodies(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
