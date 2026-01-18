package com.oop;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        // artikelen:
        ArrayList<Artikel> artikelLijst = getArtikelArrayList();

        // Practica 11 - aanmaken.
        Scanner s = new Scanner(System.in);

        System.out.println("Bron bestand: ");
        String bestandsNaam = s.nextLine();

        Path p = Path.of(bestandsNaam + "_USD");
        if (!Files.exists(p)) {
            System.out.println("bronbestand: '" + bestandsNaam + "' Bestaat niet.");
            System.out.println("Wil je dat dat bestand aangemaakt wordt? (y/n):");
            String choice = s.nextLine();

            switch(choice.toLowerCase()) {
                case "y":
                    break;
                case "n":
                    System.out.println("Programma stopt.");
                default:
                    return;
            }
        }

        // USD:
        try {
            BufferedWriter out = Files.newBufferedWriter(p);
            for (Artikel a : artikelLijst) {
                a.setPrijs(a.getPrijs());
                out.write(a.toString());
            }
            out.close();
        } catch(IOException e) {
            System.out.printf("Er is iets fout gegaan met het weg schrijven naar: %s\n", bestandsNaam);
        }
    }

    private static ArrayList<Artikel> getArtikelArrayList() {
        ArrayList<Artikel> artikelLijst = new ArrayList<>();
        Artikel a1 = new Artikel("Apacer Compact Flash 24* 256Mb (CF)", 31.00);
        Artikel a2 = new Artikel("Apacer Compact Flash 24* 512Mb (CF)", 49.00);
        Artikel a3 = new Artikel("Apacer PhotoSteno Pro II 100* 512Mb (CF)", 72.00);
        Artikel a4 = new Artikel("Apacer PhotoSteno Pro II 100* 1Gb (CF)", 144.00);
        Artikel a5 = new Artikel("Sony Memory Stick Pro 256Mb (MS)", 55.00);
        Artikel a6 = new Artikel("Sony Memory Stick Pro High Speed 512Mb (MS)", 103.00);
        Artikel a7 = new Artikel("Apacer Multi Media Card 256Mb (MMC)", 27.00);
        Artikel a8 = new Artikel("Apacer Multi Media Card 512Mb (MMC)", 48.00);
        Artikel a9 = new Artikel("Apacer Multi Media card 1Gb (MMC)", 72.00);
        Artikel a10 = new Artikel("Apacer Secure Digital 40* 256Mb (SD)", 43.00);
        Artikel a11 = new Artikel("Apacer Secure Digital 40* 1Gb (SD)", 90.00);
        Artikel a12 = new Artikel("Fuji xD Picture Card 128Mb (xD)", 29.00);
        Artikel a13 = new Artikel("Fuji xD Picture Card 256Mb (xD)", 47.00);

        artikelLijst.add(a1);
        artikelLijst.add(a2);
        artikelLijst.add(a3);
        artikelLijst.add(a4);
        artikelLijst.add(a5);
        artikelLijst.add(a6);
        artikelLijst.add(a7);
        artikelLijst.add(a8);
        artikelLijst.add(a9);
        artikelLijst.add(a10);
        artikelLijst.add(a11);
        artikelLijst.add(a12);
        artikelLijst.add(a13);
        return artikelLijst;
    }
}