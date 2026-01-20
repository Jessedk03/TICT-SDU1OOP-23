package les_1.opdracht_1_4;

public class Main {
    public static void main(String[] args) {
        Student studentJesse = new Student("Jesse");
        System.out.println("getter: " + studentJesse.getNaam());
        System.out.println("toString: " + studentJesse.toString());
        Student studentTim = new Student("Tim");
        System.out.println("getter: " + studentTim.getNaam());
        System.out.println("toString: " + studentTim.toString());
    }
}
