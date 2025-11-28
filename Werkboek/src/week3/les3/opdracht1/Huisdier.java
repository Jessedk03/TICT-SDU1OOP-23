package week3.les3.opdracht1;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar eigenaar;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public String getNaam() { return naam; }
    public String getRas()  { return ras; }

    public Eigenaar getBaasje() {
        return eigenaar;
    }

    public void setBaasje(Eigenaar e) {
        eigenaar = e;
    }

    public String toString() {
        return naam + ", de " + ras + ", weegt " + gewicht + " kg." + "\nen de eigenaar is: " + getBaasje();
    }
}
