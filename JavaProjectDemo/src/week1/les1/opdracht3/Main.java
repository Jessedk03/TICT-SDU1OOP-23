package week1.les1.opdracht3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jesse de Koe");
        System.out.println("naam: " + student1.getNaam());
        System.out.println("nummer: " + student1.getStudentNummer());
        student1.setStudentNummer(12345678);
        System.out.println("toString: " + student1.toString());

        Student student2 = new Student("Mark Knopfler", 1235672);
        System.out.println("\nnaam: " + student2.getNaam());
        System.out.println("nummer: " + student2.getStudentNummer());
        System.out.println("toString: " + student2.toString());

    }
}
