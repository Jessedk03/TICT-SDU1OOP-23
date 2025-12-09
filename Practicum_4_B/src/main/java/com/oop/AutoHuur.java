package com.oop;

public class AutoHuur {
    private int aantalDagen = 0;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {}

    public void setAantalDagen(int aD) throws IllegalArgumentException {
        if (aD < 0) {
            throw new IllegalArgumentException("Zero or Negative aD parameter not allowed");
        }

        this.aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    /**
     * a = Amount of days renting
     * e = Price per day
     * p = Percent customer gets off, if any.
     *
     * Equation:
     *  - Step 1: calculate the total with no sale:
     *  totaalZonderKorting = (e * a)
     *
     *  - Step 2: calculate the discount:
     *  korting = (totaalZonderKorting / 100 * huurder.getKorting())
     *
     *  - Step 3: calculate the total price to pay:
     *  The discount is calculated as a percentage of the total price, and subtracted from the total
     *
     *  totaalPrijs = totaalZonderKorting - korting
     *
     *  (e * a) - (totaalZonderKorting / 100 * huurder.getKorting())
     */

    public double totaalPrijs() {
        if (gehuurdeAuto == null) {
            return 0.0;
        }

        double totaalZonderKorting = gehuurdeAuto.getPrijsPerDag() * aantalDagen;

        if (huurder == null) {
            return totaalZonderKorting;
        }

        if (huurder.getKorting() < 0.0) {
            huurder.setKorting(0.0);
        }

        double korting = totaalZonderKorting / 100 * huurder.getKorting();

        return totaalZonderKorting - korting;
    }

    @Override
    public String toString() {
        String s = "\t";

        if (gehuurdeAuto == null) {
            s += "er is geen auto bekend";
        } else {
            s += gehuurdeAuto.toString();
        }
        s += "\n\t";
        if (huurder == null) {
            s += "er is geen huurder bekend";
        } else {
            s += huurder.toString();
        }

        return String.format("%s\n\taantal dagen: %d en dat kost: %.2f", s, getAantalDagen(), totaalPrijs());
    }
}
