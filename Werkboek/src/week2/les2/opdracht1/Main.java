package week2.les2.opdracht1;

public class Main {
    public static void main(String[] arg) {
        Piloot p1 = new Piloot("John Travolta");
        p1.setSalaris(123456.78);
        System.out.println("Zonder vlieguren: " + p1.toString());
        p1.verhoogVliegurenMet(12);
        System.out.println("Eerste piloot: " + p1);
        System.out.println();

        Piloot p2 = new Piloot("Leonardo di Caprio");
        p2.setSalaris(5000.00);
        p2.verhoogVliegurenMet(3);
        System.out.println("Vlieguren van tweede piloot: "+ p2.getVlieguren());
        System.out.println("Salaris van tweede piloot: " + p2.getSalaris());
        System.out.println("Tweede piloot: " + p2);
    }
}

/**
 * https://github.com/Jessedk03/TICT-SDU1OOP-23
 * ------------ wanted output:
 * Zonder vlieguren: John Travolta heeft 0 vlieguren gemaakt en verdient 123456.78
 * Eerste piloot: John Travolta heeft 12 vlieguren gemaakt en verdient 123456.78
 *
 * Vlieguren van tweede piloot: 3
 * Salaris van tweede piloot: 5000.00
 * Tweede piloot: Leonardo di Caprio heeft 3 vlieguren gemaakt en verdient 5000.00
 *
 * ------------ gotten output:
 * Zonder vlieguren: John Travolta heeft 0 vlieguren gemaakt en verdient 123456.78
 * Eerste piloot: John Travolta heeft 12 vlieguren gemaakt en verdient 123456.78
 *
 * Vlieguren van tweede piloot: 3
 * Salaris van tweede piloot: 5000.0
 * Tweede piloot: Leonardo di Caprio heeft 3 vlieguren gemaakt en verdient 5000.00
 *
 * ------------ note:
 * TODO: ^
 */
