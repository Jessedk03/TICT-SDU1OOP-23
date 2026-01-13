package com.oop;

import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String macAdress;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        this.type = tp;
        this.macAdress = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    public String getType() {
        return this.type;
    }

    public String getMacAdress() {
        return this.macAdress;
    }

    @Override
    public double huidigeWaarde() {
        if (this.productieJaar >= LocalDate.now().getYear()) {
            return this.aanschafPrijs;
        }

        int jaarVerschil = Math.max((LocalDate.now().getYear() - this.productieJaar), 0);

        double berekendePrijs = this.aanschafPrijs - this.aanschafPrijs * 0.4 * jaarVerschil;

        if (berekendePrijs < 0) {
            return this.aanschafPrijs - this.aanschafPrijs * 0.9;
        }

        return berekendePrijs;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof Computer) {
            Computer c = (Computer) obj;
            if (this.getType().equals(c.getType()) && this.getMacAdress().equals(c.getMacAdress())) {
                result = true;
            }
            return result;
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("%s met macAddr: %s, gemaakt in: %d, €%.2f", this.getType(), this.getMacAdress(), this.productieJaar, this.aanschafPrijs);
    }
}
