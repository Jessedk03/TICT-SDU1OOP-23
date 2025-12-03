package com.oop;

public class Auto {
    private String type;
    private double prijsPerDag;
    private AutoHuur[] autoHuur;

    public Auto(String tp, double prPd) throws IllegalArgumentException {
        if (prPd < 0.0) {
            throw new IllegalArgumentException("Zero or Negative prPd parameter not allowed");
        }
        this.type = tp;
        this.prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd) {
        this.prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    @Override
    public String toString() {
        return String.format("%s met prijs per dag: %.2f", type, prijsPerDag);
    }
}
