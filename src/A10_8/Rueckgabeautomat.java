package A10_8;
/*die minimale Anzahl an vorhandenen Geldstücken zurückgibt,
die auf einen Einzahlbetrag einzahlung (Beispiel 10 Euro) und einen zu zahlenden Betrag zahlbetrag (Beispiel 8,57 Euro)
sich aufgrund des aktuellen Münzbestands im Automaten ergeben.*/
/*Instanziieren Sie zwei Rückgabeautomaten mit unterschiedlichem Bestand und lassen sich für den zu zahlenden Betrag
von 57 Cent auf den Betrag von 100 Cent Rückgeld geben.*/

public class Rueckgabeautomat {
    // diese Wertigkeiten sind fuer Alle Automaten guelltig, deshalb Klassenavariable
    private static int [] wertigkeiten = {200,100,50,20,10,5,2,1};
    // Anzahl getaetigter Auszahlungen dieses Automaten
    private int auszahlungen;
    // aktueller Bestand dieses Automaten
    private int [] muenzbestand = {0,0,0,0,0,0,0,0};

    // erzeuge Rueckgabeautomat
    public Rueckgabeautomat(int [] anfangsbestand) {
        auszahlungen = 0;
        for (int i = 0; i <anfangsbestand.length; i++) {
            muenzbestand[i] = anfangsbestand[i];
        }
    }
    // public String toString hier ist nicht geeignet, weil  die Methode gibt 1 String zuruck, wiederum Method getMuenzbestand gibt
    // eine [] int Array zuruck

    // liefert aktuellen Muenzbestand
    public int [] getMuenzbestand() {
        // wir klone das Feld, damit keiner in unserem Feld rumpfuschen kann
        return muenzbestand.clone();
    }
    // berechnet Rueckgeld
    public int [] zahlen(int einzahlbetrag, int betrag) {
        // jedes Mal das Automal zaehlt, die Anzahl von Auszahlung ist um 1 erhoeht
        auszahlungen++;
        // Rueckgeld, das wir auszahlen muessen
        int rueckgeld = einzahlbetrag - betrag;
        System.out.println("Rueckgeld = " + rueckgeld);
        // angeben, wie viele Muenzen entsprechenden Rueckgeld zuruckegen
        int[] muenzen = new int[wertigkeiten.length];
        for (int i = 0; i < wertigkeiten.length; i++) {
            // wenn es braucht nicht mehr auszuzahlen, break the Process
            if (rueckgeld == 0)
                break;
            // die Anzahl von zuruckgegebene Muenzen hier ermitteln
            // Achten: Wenn die Anzahl von zuruckgegebene Muenzen groesser als die Anzahl von Muenzen, die wir haben
            // zb, wir mussen 3 Mal 100 Cent geben, aber haben wir nur 2 Mal
            if (rueckgeld >= wertigkeiten[i]) {
                int anzahl;
                anzahl = rueckgeld / wertigkeiten[i];
                // Falls die Anzahl von zuruckgegebene Muenzen groesser als die Anzahl von Muenzen, die wir haben
                if (anzahl > muenzbestand[i]) {
                    anzahl = muenzbestand[i];
                }
                // dann geben wir nur solche Anzahl von Muenzen, die wir maximal haben
                muenzen[i] = anzahl;
                // reduzierter Bestand von Anzahl an Muenzen
                muenzbestand[i] -= anzahl;
                // das Ruckgeld bleibt noch
                rueckgeld -= anzahl * wertigkeiten[i];

                System.out.println(wertigkeiten[i] + ":" + anzahl);

            }
            // Nach Prozesse ist das Rueckgelb noch da, konnen wir nicht mehr auszahlen
            if (rueckgeld > 0) {
                System.out.println("Achtung: korrekte Rueckgabe war nicht moeglich!");
            }
        }
        return muenzen;
    }
    private static void zeigeGeld(String ueberschrift, int[] anzahl) {
        System.out.println(ueberschrift + "");
            for (int i = 0; i < anzahl.length; i++) {
                if(anzahl[i] > 0) {
                    System.out.println(wertigkeiten[i] + " Cent: " + anzahl[i]+ ","); ;
                }
            }
        System.out.println();
    }
    public static void main(String[] args) {
        Rueckgabeautomat a1 = new Rueckgabeautomat(new int[] {1,1,1,1,1,1,1,1});
        Rueckgabeautomat a2 = new Rueckgabeautomat(new int[] {2,2,2,2,2,2,2,2});

        zeigeGeld("Bestand Automat 1", a1.getMuenzbestand());
        zeigeGeld("Bestand Automat 2", a2.getMuenzbestand());

        int [] rueckgeld1 = a1.zahlen(100,57);
        int [] rueckgel2 = a2.zahlen(100,57);
        zeigeGeld("Bestand Automat 1", a1.getMuenzbestand());
        zeigeGeld("Bestand Automat 2", a2.getMuenzbestand());

    }

}
