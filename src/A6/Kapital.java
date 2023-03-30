package A6;

import java.sql.SQLOutput;

public class Kapital {
    public static void main(String[] args) {
        int t = 30;        // 30 Jahre
        double ak = 10000.0; // Anfangskapital
        double zinssatz = 0.05; // Jahreszinssatz 5%
        //Das Endkapitel nach t Jahren
        //lässt sich leicht nach der Formel EK = AK(1 + z)t ausrechnen
        double ek = ak* Math.pow(1.0 + zinssatz, t); // Endskapital
        ek = Math.floor(ek*100.0) /100.0;
        System.out.println("Version 1:" + ek);
        //nach jedem Jahr basierend auf dem Vorjahreskapital der Zins berechnet wird,
        // dieser auf 2 Stellen hinter dem Komma (d.h. auf Cent) abgeschnitten wird und
        //dieser korrigierte Zinsbetrag auf das Kapital aufaddiert wird.

        double ek1;
        double ek2 = ak;
        for (int i = 0; i < t; i++) {
            ek1 = ek2*(1.0 + zinssatz);
            ek2 = Math.floor(ek1*100.0) /100.0;
        }
        System.out.println("Version 2: " + ek2);
        System.out.println("Differenz: "+ (ek-ek2));
        System.out.println("Differenz bei 100000 Konto: " +(ek-ek2)*100000);
    }
}
