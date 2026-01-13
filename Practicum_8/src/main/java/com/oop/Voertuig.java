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

    public String getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if(obj instanceof Voertuig) {
            Voertuig v = (Voertuig) obj;

            if (this.getType().equals(v.getType()) && this.nieuwPrijs == v.nieuwPrijs && this.bouwJaar == v.bouwJaar) {
                result = true;
            }

            return result;
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("Voertuig: %s met bouwjaar %d heeft een waarde van: \u20ac%.2f", this.type, this.bouwJaar, this.nieuwPrijs);
    }
}
