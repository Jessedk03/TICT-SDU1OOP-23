package week4.les4.opdracht1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        ArrayList<Huisdier> huisdieren1 = new ArrayList<Huisdier>();
        ArrayList<Huisdier> huisdieren2 = new ArrayList<Huisdier>();

        Eigenaar e1 = new Eigenaar("Willem de Moller");
        huisdieren1.add(new Huisdier("Nero", "Dobermann"));
        e1.setBeestje(huisdieren1);
        System.out.println(e1);
        System.out.println(e1.getNaam() + " heeft: " + huisdieren1.size() + " huisdieren\n");

        Eigenaar e2 = new Eigenaar("Pluk");
        huisdieren2.add(new Huisdier("Moussa", "Boxer"));
        huisdieren2.add(new Huisdier("Floortje", "Labrador"));
        huisdieren2.add(new Huisdier("Marcel", "Golden Retriever"));

        System.out.println(e2);
        System.out.println(e2.getNaam() + " heeft: " + huisdieren2.size() + " huisdieren\n");

        e2.setBeestje(huisdieren2);

        System.out.println();
        System.out.println(e2);

        System.out.println(huisdieren2.get(1));
        huisdieren2.addFirst(new Huisdier("Belle", "Boxer"));
        System.out.println(huisdieren2.get(1));

        System.out.println();

        System.out.println(huisdieren2.get(2));
        huisdieren2.set(2, new Huisdier("Pukkie", "Malteser"));
        System.out.println(huisdieren2.get(2));

        e2.setBeestje(huisdieren2);

        System.out.println();
        System.out.println(e2);
    }
}
