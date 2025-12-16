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
