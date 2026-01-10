package com.oop;

abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwPrijs;
    protected int bouwJaar;

    public Voertuig(String tp, double pr, int jr) {
        this.type = tp;
        this.nieuwPrijs = pr;
        this.bouwJaar = jr;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        return "";
    }
}
