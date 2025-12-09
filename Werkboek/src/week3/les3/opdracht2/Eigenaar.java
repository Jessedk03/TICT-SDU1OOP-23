package week3.les3.opdracht2;

public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;

    public Eigenaar(String nm) {
        naam = nm;
    }

    public void setGiroNr(int nr) { giroNr = nr; }

    public int getGiroNr()  { return giroNr; }
    public String getNaam() { return naam; }

    public void setBeestje(Huisdier hd){
        this.beestje = hd;
    }

    public Huisdier getBeestje(){
        return beestje;
    }

    public String toString() {
        return naam + " heeft giro " + giroNr + " En is het baasje van " + beestje;
    }
}

