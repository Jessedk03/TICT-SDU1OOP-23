package com.oop;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int frameNummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        this.frameNummer = fnr;
    }

    @Override
    public double huidigeWaarde() {
        if (super.bouwJaar >= LocalDate.now().getYear()) {
            return super.nieuwPrijs;
        }

        int jaarVerschil = Math.max((LocalDate.now().getYear() - super.bouwJaar), 0);

        double berekendePrijs = super.nieuwPrijs - super.nieuwPrijs * 0.1 * jaarVerschil;

        if (berekendePrijs < 0) {
            return this.nieuwPrijs - this.nieuwPrijs * 0.9;
        }

        return berekendePrijs;
    }
}
