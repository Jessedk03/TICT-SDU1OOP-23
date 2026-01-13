package com.oop;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris bi = new BedrijfsInventaris("NBIP", 5000000);
        Computer c1 = new Computer("Commodore Amiga 2000", "00:80:10:00:00:01", 1300.00, 1989);
        Computer c2 = new Computer("Commodore Amiga 2000", "00:80:10:00:00:01", 1300.00, 1989);

        Fiets f1 = new Fiets("Batavus", 500.0, 2025, 120120);
        Fiets f2 = new Fiets("Batavus", 500.0, 2025, 120120);

        Fiets f3 = new Fiets("Gazelle", 100, 2025, 140525);

        Auto a1 = new Auto("Ford Fiesta", 7000, 2015, "GNR-41-L");
        Auto a2 = new Auto("Ford Fiesta", 7000, 2015, "GNR-41-L");

        Auto a3 = new Auto("Suzuki Swift Sport", 4000, 2008, "ABC-12-D");

        bi.schafAan(c1);
        bi.schafAan(c2);
        bi.schafAan(f1);
        bi.schafAan(f2);
        bi.schafAan(a1);
        bi.schafAan(a2);

        bi.schafAan(f3);
        bi.schafAan(a3);

        System.out.println(bi);
    }
}