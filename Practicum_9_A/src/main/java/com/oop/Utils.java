package com.oop;

abstract class Utils {

    protected static int aangeroepen = 0;

    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        aangeroepen++;
        return String.format("€%." + precisie + "f", bedrag);
    }

    public static int aangeroepen() {
        return aangeroepen;
    }
}
