package week1.les1.opdracht3;

public class Student {
    private String naam;
    private Integer studentNummer = 0;

    public Student (String naam) {
        this.naam = naam;
    }

    public Student (String naam, Integer studentNummer) {
        this.naam = naam;
        this.studentNummer = studentNummer;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        String s = "Deze student heet " + naam;
        if (studentNummer > 0) {
            s += " en heeft nummer: " + studentNummer;
        }
        return s;
    }

    public Integer getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(Integer studentNummer) {
        this.studentNummer = studentNummer;
    }
}
