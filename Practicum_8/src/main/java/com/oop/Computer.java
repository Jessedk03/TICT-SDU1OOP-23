package com.oop;

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

    @Override
    public double huidigeWaarde() {
        return 0;
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
