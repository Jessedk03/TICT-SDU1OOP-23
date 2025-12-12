package week5.les5.opdracht1;

import java.util.ArrayList;

public class FacebookAccount {
    private String naam;
    private ArrayList<Vriend> mijnVrienden = new ArrayList<>();

    public FacebookAccount(String nm) {
        this.naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public void voegVriendToe(Vriend nwV) {
        if(!mijnVrienden.contains(nwV)) {
            this.mijnVrienden.add(nwV);
        }
    }

    public boolean verwijderVriend(Vriend exV) {
        return this.mijnVrienden.remove(exV);
    }

    public boolean isVriendMet(Vriend v) {
        // TODO:
        return true;
    }

    public int aantalVrienden() {
        return this.mijnVrienden.size();
    }
}
