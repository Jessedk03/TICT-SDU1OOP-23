package com.oop;

public class Fiets extends Voertuig {
    private int frameNummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        this.frameNummer = fnr;
    }

    @Override
    public double huidigeWaarde() {
        return 0;
    }
}
