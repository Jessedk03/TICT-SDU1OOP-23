package week2.les2.opdracht1;

public class Piloot {
    private String naam;
    private int vlieguren = 0;
    private double salaris = 0;

    public Piloot(String nm) {
        naam = nm;
    }

    public int getVlieguren() {
        return vlieguren;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double sal) {
        salaris = sal;
    }

    public void verhoogVliegurenMet(int extraUren) {
        vlieguren += extraUren;
    }

    @Override
    public String toString() {
        return String.format("%s heeft %d vlieguren gemaakt en verdient %.2f", naam, vlieguren, salaris);
    }

}
