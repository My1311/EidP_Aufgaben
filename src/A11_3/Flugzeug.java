package A11_3;

public class Flugzeug {
    // Klassenvariablen
    static int anzahl;
    // Instanzvariablen
    double spannweite;
    int plaetze; // Sitzkapazitaet
    // Konstruktor
    public Flugzeug(double spannweite, int plaetze) {
        this.spannweite = spannweite;
        this.plaetze = plaetze;
        // 1 Flugzeug mehr
        ++ anzahl;
    }
    // Klassenmethode
    public static int getAnzahl() {
        return anzahl;
    }

    public String toString() {
        return "Spannweite: " + spannweite + ",Sitze: " + plaetze;
    }
}
