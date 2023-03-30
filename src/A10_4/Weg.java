package A10_4;


import java.util.Arrays;

public class Weg {
    Punkt punkte;
    int anzahl; // anzahl der Wegpunkte, Laenge
    String ausgabe ="";
    public Weg(Punkt punkt, int anzahl){
        this.punkte = punkt;
        this.anzahl = 1;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public String toString() {
        if (anzahl == 1) {
             return ausgabe = punkte.toString();
        } else {
            return ausgabe;
        }
    }

    public void verlaengern(Weg w) {
        anzahl += 1;
        ausgabe += "-"+w;
    }
}
