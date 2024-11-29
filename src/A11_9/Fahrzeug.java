package A11_9;

public class Fahrzeug {
    private int raeder;
    private int sitze;

    private static int anzahl;

    public Fahrzeug(int r, int s) {
        raeder = r;
        sitze = s;
        anzahl++;
    }
    public String toString() {
        return "Fahrzeug hat " + raeder + " Raeder und " + sitze + " Sitze";
    }
    public static int getAnzahlFahrzeuge() {
        return anzahl;
    }
}
