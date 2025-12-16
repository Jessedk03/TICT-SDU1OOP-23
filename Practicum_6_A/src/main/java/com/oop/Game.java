package com.oop;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return this.naam;
    }

    public double huidigeWaarde() {
        if (releaseJaar >= LocalDate.now().getYear()) {
            return this.nieuwprijs;
        }

        int jaarVerschil = Math.max((LocalDate.now().getYear() - releaseJaar), 0);

        return this.nieuwprijs * Math.pow(0.7, jaarVerschil);
    }

    @Override
    public boolean equals(Object andereObject) {
        boolean resultaat = false;

        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;

            if (naam.equals(andereGame.getNaam()) && releaseJaar == andereGame.releaseJaar) {
                resultaat = true;
            }
        }

        return resultaat;
    }

    @Override
    public String toString() {
        return String.format("%s, uitgegeven in %d; nieuwprijs: \u20ac%.2f nu voor: \u20ac%.2f", this.getNaam(), this.releaseJaar, this.nieuwprijs, huidigeWaarde());
    }
}
