package com.oop;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private ArrayList<Goed> alleGoederen;
    private String bedrijfsNaam;
    private double budget;

    public BedrijfsInventaris(String nm, double bud) {
        this.alleGoederen = new ArrayList<>();
        this.bedrijfsNaam = nm;
        this.budget = bud;
    }

    public void schafAan(Goed g) {
        if (g != null) {
            this.alleGoederen.add(g);
        }
    }

    @Override
    public String toString() {
        return "";
    }
}
