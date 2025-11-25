package com.oop;

public class Voetbalclub {

    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub() {
        naam = "FC";
    }

    public Voetbalclub(String vv) {
        naam = vv;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten() {
        return (aantalGelijk) + (aantalGewonnen * 3);
    }

    public int aantalGewonnenPunten() {
        return (aantalGewonnen * 3);
    }

    public int aantalGespeeld() {
        return aantalVerloren + aantalGelijk + aantalGewonnen;
    }

    public String getName() {
        return naam;
    }

    public void setNaam(String nm) {
        this.naam = nm;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d %d %d %d", naam, aantalGespeeld(), aantalGewonnenPunten(), aantalGewonnen, aantalGelijk, aantalVerloren, aantalPunten());
    }
}
