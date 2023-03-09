package A10;

public class Pruefung {
    String name;
    String datum;
    int creditanzahl;
    Ergebnis [] ergebnisse;
    //  man kann eine Prüfung noch ohne Ergebnisse anlegen
    public Pruefung(String name, String datum, int creditanzahl) {
        this.name = name;
        this.datum = datum;
        this.creditanzahl = creditanzahl;
        this.ergebnisse = new Ergebnis[0];
    }
    public void neuesErgbnis (Ergebnis e) {
        // Feld anlegen, das eins laenger ist
        Ergebnis[] neu = new Ergebnis[ergebnisse.length + 1];
        // alte Ergbnisse kopieren
        for (int i = 0; i < ergebnisse.length; i++) {
            neu[i]=ergebnisse[i];
        }
        // neues Ergebnis hinzufuegen
        neu[ergebnisse.length] = e;
        // alte Ergebnisliste ersetzen
        ergebnisse = neu;
    }
    public String toString() {
        String s = "Pruefung " + name + " vom " + datum + " mit "+ creditanzahl + " Credits\n";
        for (int i = 0; i < ergebnisse.length; i++) {
            s = s + ergebnisse[i] + "\n";
        }
        return s;
    }
    public static void main(String[] args) {
        // 2 Studenten erzeugen
        Student willi = new Student("Willi","Wichtig", 900);
        Student helga = new Student("Helga", "Eifrig", 901);
        // 2 Pruefungsergebnisse erzeugen
        Ergebnis e1 = new Ergebnis(willi, 4.0f, 60);
        Ergebnis e2 = new Ergebnis(helga, 1.0f, 118);
        // eine Pruefung erzeugen
        Pruefung eidp = new Pruefung("Einfuehrung in die Programmierung", "29.01.2021", 9);
        eidp.neuesErgbnis(e1);
        eidp.neuesErgbnis(e2);
        // hier wird implizit die toString Methode aufgerufen
        System.out.println(eidp);
    }
}
