package com.oop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bron bestand:");
        String bestandsNaam = sc.nextLine();

        System.out.println("Bestands locatie:");
        String bestandsLocatie = sc.nextLine();

        System.out.printf("Eigen koers? huidige koers %s:\n", Utils.euroToDollarExample());
        String koers = sc.nextLine();

        double customKoers = Utils.dollarToEuroConversionRate;
        if (!koers.isEmpty()) {
            try {
                customKoers = Double.parseDouble(koers);
            } catch (NumberFormatException e) {
                System.out.println("Kan geen letters in de koers zetten.");
            }
        }

        Path sourcePad = Paths.get(bestandsLocatie, bestandsNaam + "_USD");
        Path targetPad = Paths.get(bestandsLocatie, bestandsNaam + "_EUR");

        try {
            List<String[]> lijst = readFromFile(sourcePad);
            writeToFile(targetPad, lijst, customKoers);
        } catch(IOException e) {
            System.out.println("Er is iets fout gegaan met het lezen/ schrijven van de bestanden.");
        }
    }

    private static List<String[]> readFromFile(Path pad) throws IOException {
        List<String[]> productLijst = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(pad)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] splittedString = line.split(" : ");
                productLijst.add(splittedString);
            }
        }

        return productLijst;
    }

    private static void writeToFile(Path pad, List<String[]> productLijst, double koers) throws IOException {
        try (BufferedWriter bw = Files.newBufferedWriter(pad)) {
            for (String[] s : productLijst) {
                double converted = Utils.dollarToEuroConversion(koers, s[1]);
                bw.write(String.format("%s : %.2f\n", s[0], converted));
            }
        }
    }
}
