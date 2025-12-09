package com.oop;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr) {
        this.adres = adr;
        this.bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb) {
        this.huisbaas = hb;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    /**
     * Here I apply the Guard pattern:
     * If the required data (huisbaas in this case) is missing, return early to avoid unnecessary processing.
     * https://en.wikipedia.org/wiki/Guard_(computer_science)
     */

    @Override
    public String toString() {
        if (huisbaas == null) {
            return String.format("Huis %s is gebouwd in %d", this.adres, this.bouwjaar);
        }
        return String.format("Huis %s is gebouwd in %d \nen heeft huisbaas %s", this.adres, this.bouwjaar, this.huisbaas);
    }
}
