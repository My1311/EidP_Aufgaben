package A10;

public class Ergebnis {
    Student student;
    float note;
    int punktzahl;

    public Ergebnis(Student student1, float note1, int punktzahl1){
        this.student = student1;
        this.note = note1;
        this.punktzahl = punktzahl1;
    }
    public String toString() {
        return student + " Note=" + note + " Punktzahl=" + punktzahl;
    }
    public static void main(String[] args) {
        // 2 Studenten erzeugen
        Student willi = new Student("Willi","Wichtig", 900);
        Student helga = new Student("Helga", "Eifrig", 901);
        // 2 Pruefungsergebnisse erzeugen
        Ergebnis e1 = new Ergebnis(willi, 4.0f, 60);
        Ergebnis e2 = new Ergebnis(helga, 1.0f, 118);
        // hier wird implizit die toString Methode aufgerufen
        System.out.println(e1);
        System.out.println(e2);
    }
}
