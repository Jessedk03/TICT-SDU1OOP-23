package les_1.opdracht_1_4;

public class Student {

    private final String naam;

    public Student(String nm) {
        this.naam = nm;
    }

    public String getNaam() {
        return this.naam;
    }

    @Override
    public String toString() {
        return String.format("Deze student heet %s", this.getNaam());
    }
}
