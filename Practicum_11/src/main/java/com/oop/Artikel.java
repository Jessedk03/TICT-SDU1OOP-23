package com.oop;

import static com.oop.Munt.*;

public class Artikel {

    private String naam;
    private double prijs;
    private Munt munt;

    public Artikel(String nm, double pr) {
        this(nm, pr, DOLLAR);
    }

    public Artikel(String nm, double pr, Munt m) {
        this.naam = nm;
        this.prijs = pr;
        this.munt = m;
    }

    public String getNaam() {
        return naam;
    }

    public String getMuntEenheid() {
        return munt.toString();
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double nwPr) {
        this.prijs = nwPr;
    }

    @Override
    public String toString() {
        return String.format("%s : %.2f\n", this.getNaam(), this.getPrijs());
    }
}
