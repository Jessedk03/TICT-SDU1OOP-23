package com.oop;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        this.naam = nm;
    }

    public void setKorting(double kP) {
        if (kP < 0.0) {
            kP = 0.0;
        } else if (kP > 100.0) {
            kP = 100.0;
        }

        this.kortingsPercentage = kP;
    }

    public double getKorting() {
        return this.kortingsPercentage;
    }

    @Override
    public String toString() {
        return String.format("%s (korting: %.1f%%)", naam, kortingsPercentage);
    }
}
