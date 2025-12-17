package com.oop;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<>();

    public Persoon(String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return this.budget;
    }

    public boolean koop(Game g) {
        if (this.budget < g.huidigeWaarde()) {
            return false;
        }

        if (mijnGames.contains(g)) {
            return false;
        }

        this.budget = this.budget - g.huidigeWaarde();
        return this.mijnGames.add(g);
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (mijnGames.contains(g) && koper.koop(g)) {
            mijnGames.remove(g);
            this.budget += g.huidigeWaarde();
            return true;
        }

        return false;
    }

    // Practicum_6_B Task 1
    public Game zoekGameOpNaam(String gNm) {
        for (Game g : mijnGames) {
            if (gNm.equals(g.getNaam())) {
                return g;
            }
        }
        return null;
    }

    // Practicum_6_B Task 2
    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> gameList) {
        ArrayList<Game> gamesNietInBezit = new ArrayList<>();
        for (Game gL : gameList) {
            if (!mijnGames.contains(gL)) {
                gamesNietInBezit.add(gL);
            }
        }
        return gamesNietInBezit;
    }

    @Override
    public String toString() {
        StringBuilder mijnGamesList = new StringBuilder();

        for (Game g : mijnGames) {
            mijnGamesList.append('\n');
            mijnGamesList.append(g.toString());
        }

        return String.format("%s heeft een budget van \u20AC%.2f en bezit de volgende games:%s", this.naam, getBudget(), mijnGamesList);
    }
}
