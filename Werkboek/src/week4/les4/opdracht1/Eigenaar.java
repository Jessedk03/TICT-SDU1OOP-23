package week4.les4.opdracht1;

import java.util.ArrayList;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private ArrayList<Huisdier> beestje = new ArrayList<Huisdier>();

    public Eigenaar(String nm) {
        naam = nm;
    }

    public void setGiroNr(int nr) { giroNr = nr; }

    public int getGiroNr()  { return giroNr; }
    public String getNaam() { return naam; }

    public void setBeestje(ArrayList<Huisdier> hd){
        this.beestje = hd;
    }

    public ArrayList<Huisdier> getBeestje(){
        return beestje;
    }

    public String toString() {
        String s = naam + " heeft giro " + giroNr + " En is het baasje van";
        for (Huisdier dier : getBeestje()){
            s += "\n" + dier;
        }
        return s;
    }
}

