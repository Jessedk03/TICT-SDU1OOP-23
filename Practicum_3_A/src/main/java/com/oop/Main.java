package com.oop;

public class Main {
    // https://github.com/Jessedk03/TICT-SDU1OOP-23.git
    public static void main(String[] args) {
        Voetbalclub ajx = new Voetbalclub("Ajax      ");
        Voetbalclub feij = new Voetbalclub("Feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + feij.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();

        System.out.println(ajx);
        System.out.println(feij);
    }
}