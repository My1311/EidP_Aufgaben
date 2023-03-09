package A10;

public class Student {
    // Instanzvariable
    String vorname;
    String nachname;
    int matrikelnummer;
    // Konstruktor
    public Student (String vorname, String nachname, int matrikelnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this. matrikelnummer = matrikelnummer;
    }
    public String toString() {
        return vorname + " " + nachname + " (" + matrikelnummer + ")";
    }
    public static void main(String[] args) {
        Student willi = new Student("Willi","Wichtig", 900);
        Student helga = new Student("Helga", "Eifrig", 901);
        // hier wird implizit die toString Methode aufgerufen
        System.out.println(willi);
        System.out.println(helga);
    }
}
