package com.oop;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<>();

    public Klas(String kC) {
        if (kC.isEmpty()) {
            throw new IllegalArgumentException("Klas heeft een klascode!");
        }
        this.klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        if (l == null) {
            return;
        }

        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling l : deLeerlingen) {
            if (l.getNaam().equals(nm)) {
                l.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen() {
        return deLeerlingen.size();
    }

    @Override
    public String toString() {
        String s = String.format("In klas %s zitten de volgende leerlingen: \n", klasCode);

        if (getLeerlingen().isEmpty()) {
            s += "\tOops... er zitten geen leerlingen in deze klas...\n";
            return s;
        }

        for (Leerling l : getLeerlingen()) {
            s += l.toString();
            s += "\n";
        }
        return s;
    }
}
