package les_1.opdracht_1_5;

public class Main {
    public static void main(String[] args) {
        Student studentJesse = new Student("Jesse");
        System.out.println("naam: " + studentJesse.getNaam());
        System.out.println("nummer: " + studentJesse.getStudentNummer() );
        studentJesse.setStudentNummer(12345678);
        System.out.println("toString: " + studentJesse.toString());
        System.out.println();

        Student studentKarel = new Student("Karel", 98765432);
        System.out.println("naam: " + studentKarel.getNaam());
        System.out.println("nummer: " + studentKarel.getStudentNummer());
        System.out.println("toString: " + studentKarel.toString());

    }
}
