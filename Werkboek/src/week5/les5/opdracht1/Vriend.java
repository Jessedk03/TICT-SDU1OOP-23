package week5.les5.opdracht1;

public class Vriend {
    private String voornaam;
    private String achternaam;
    private String email;

    public Vriend(String vnm, String anm, String em) {
        this.voornaam = vnm;
        this.achternaam = anm;
        this.email = em;
    }

    @Override
    public boolean equals(Object andereObject) {
        return true;
    }

    @Override
    public String toString() {
        return "";
    }
}
