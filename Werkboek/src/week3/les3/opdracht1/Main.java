package week3.les3.opdracht1;

public class Main {
    public static void main(String[] arg) {
        Huisdier hd1 = new Huisdier("Nero", "Dobermann");
        Eigenaar e1 = new Eigenaar("Willem de Moller");
        System.out.println(hd1);
        hd1.setBaasje(e1);
        System.out.println(hd1);
        System.out.println();

        Huisdier hd2 = new Huisdier("Zaza", "kakkerlak");
        Eigenaar e2 = new Eigenaar("Pluk");
        System.out.println(hd2);
        hd2.setBaasje(e2);
        System.out.println(hd2);
    }

    /**
     * expected results:
     * Nero, de Dobermann, weegt 0.0 kg.
     * En de eigenaar is: null
     * Nero, de Dobermann, weegt 0.0 kg.
     * En de eigenaar is: Willem de Moller heeft giro 0
     *
     * Zaza, de kakkerlak, weegt 0.0 kg.
     * En de eigenaar is: null
     * Zaza, de kakkerlak, weegt 0.0 kg.
     * En de eigenaar is: Pluk heeft giro 0
     */
}

