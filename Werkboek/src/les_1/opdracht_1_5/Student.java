package les_1.opdracht_1_5;

public class Student {

    private final String naam;
    private int studentNummer;

    public Student(String nm) {
        this.naam = nm;
    }

    public Student(String nm, int stNr) {
        this.naam = nm;
        this.setStudentNummer(stNr);
    }

    public String getNaam() {
        return this.naam;
    }

    public int getStudentNummer() {
        return this.studentNummer;
    }

    public void setStudentNummer(int stnr) {
        this.studentNummer = stnr;
    }

    @Override
    public String toString() {
        return String.format("Deze student heet %s en heeft nummer: %d", this.getNaam(), this.getStudentNummer());
    }
}
