package A8;
/*Entwickeln Sie eine Methode, die für eine Eingabezahl zwischen 20 und 99 den
 Zahltext zu dieser Zahl als Ergebnis liefert, also einen String.
 Beispiel: zu 45 würde der Text fuenfundvierzig geliefert.
 */

public class Zahltext {
    public static String erzeugen(int zahl) {
        String [] zehnerNamen = {"","", "zwanzig","dreissig","vierzig","fuenfzig","sechszig","siebzig","achtzig","neunzig"};
        String[] einerNamen = {"", "ein","zwei","drei","vier","fuenf","sechs","sieben","acht","neun"};

        int zehner = zahl / 10;
        int einer = zahl %10;
        return (einer == 0 ) ? zehnerNamen[zehner] : einerNamen[einer] + "und" +zehnerNamen[zehner];
    }

    public static void main (String [] args) {
        for (int i = 20; i <100 ; i++) {
            System.out.println("Zahl " + i + " hat Zahltext " + erzeugen(i));

        }
    }
}
