package week1.les1.opdracht3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jesse de Koe");
        Student student2 = new Student("Mark Knopfler");

        System.out.printf("getter: %s \ntoString: %s\n", student1.getNaam(), student1.toString());
        System.out.printf("getter: %s \ntoString: %s\n", student2.getNaam(), student2.toString());
    }
}
