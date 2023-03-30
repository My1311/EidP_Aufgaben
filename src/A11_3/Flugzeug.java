package A11_3;

public class Flugzeug {
    // Klassenvariablen
    static int anzahl;
    // Instanzvariablen
    double spannweite;
    int kapazitaet; // Sitzkapazitaet
    // Konstruktor
    public Flugzeug(double spannweite, int kapazitaet) {
        this.spannweite = spannweite;
        this.kapazitaet = kapazitaet;
        // 1 Flugzeug mehr
        ++ anzahl;
    }
}
