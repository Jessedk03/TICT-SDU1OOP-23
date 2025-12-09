package com.oop;

import java.util.Locale;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String nm) {
        if (nm.isEmpty()) {
            throw new IllegalArgumentException("Leerling heeft een naam!");
        }
        this.naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double c) {
        if (c < 0.0) {
            c = 0.0;
        } else if (c > 10) {
            c = 10;
        }
        this.cijfer = c;
    }

    /**
     * I added the "Locale.ENGLISH" as the first parameter, because the given output shows the decimal separator
     * with a '.' (dot). Since the laptop I programmed this on was set to the Dutch number localization (nl).
     * The decimal separator here are with a ',' (comma); To get a dot as a decimal separator I needed to force the Locale
     * to make sure the decimal separator is the same the given output.
     * @return String formatted for the toString method.
     */

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "%s heeft cijfer: %.1f", getNaam(), getCijfer());
    }

}
