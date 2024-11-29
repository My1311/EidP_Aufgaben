package A11_3;

public class Passagierflugzeug extends Flugzeug{
    // Klassenvariable
    static int anzahl;
    int Motoren;
    double schub; // Motoren mit Schub
    public Passagierflugzeug(double spannbreite, int plaetze, double schub) {
        // Segelflugzeug hat immer nur einen Sitzplatz
        super(spannbreite,plaetze);
        this.schub = schub;
        // 1 Flugzeug mehr
        anzahl++;
    }
    public static int getAnzahl() {
        return anzahl;
    }

    @Override
    public String toString() {
        return super.toString() + ", Schub: "+ schub+ " (Passagierflugzeug)";
    }
}

