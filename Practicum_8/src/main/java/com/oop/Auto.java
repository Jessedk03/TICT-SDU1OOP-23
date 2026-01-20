package com.oop;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        this.kenteken = kt;
    }

    public String getKenteken() {
        return this.kenteken;
    }

    @Override
    public double huidigeWaarde() {
        if (super.bouwJaar >= LocalDate.now().getYear()) {
            return super.nieuwPrijs;
        }

        int jaarVerschil = Math.max((LocalDate.now().getYear() - super.bouwJaar), 0);

        double berekendePrijs = super.nieuwPrijs - super.nieuwPrijs * 0.3 * jaarVerschil;

        if (berekendePrijs < 0) {
            return this.nieuwPrijs - this.nieuwPrijs * 0.9;
        }

        return berekendePrijs;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof Auto) {
            Auto auto = (Auto) obj;

            if (this.kenteken.equals(auto.getKenteken()) && super.equals(auto)) {
                result = true;
            }

            return result;
        }

        return result;
    }
}
