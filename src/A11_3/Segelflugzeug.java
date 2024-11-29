package A11_3;

public class Segelflugzeug extends Flugzeug{
    // Klassenvariable
    static int anzahl;
    public Segelflugzeug(double spannbreite) {
        // Segelflugzeug hat immer nur einen Sitzplatz
        super(spannbreite,1);
        // 1 Segelflugzeug mehr
        anzahl++;
    }
    public static int getAnzahl() {
        return anzahl;
    }

    @Override
    public String toString() {
        return super.toString() + " (Segelflugzeug)";
    }
}
