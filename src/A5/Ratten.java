package A5;
/*Ein Rattenpärchen kann jeden Monat ca. 12 kleine Ratten werfen, die nach ca. zwei Monaten selbst geschlechtsreif sind.
Unter der Annahme, dass genau gleich viele männliche wie weibliche Ratten in einem Wurf sind und Ratten niemals
sterben: wieviele Ratten existieren mit obigen Annahmen nach n Monaten, wenn ein Wurf genau 12 kleine Ratten hat und
die Geschlechteraufteilung gleichmäßig ist und wir davon ausgehen, dass das erste Rattenpärchen bereits im ersten Monat
2einen Wurf Junge bekommt?
 */
public class Ratten {
    public static void main(String args []) {
        int erwachsene = 1 ; // Anzahl der Paare, die Nachwuchs bekommen koennen
        int kinder = 0 ; // Anzahl der Paare, die Nachwuchs  erst in naechsten Monant bekommen koennen
        int babies = 0; // Anzahl der Paare, die Nachwuchs in 2 Monaten bekommen koennen
        int gesamtpopulation = 0;
        int monate = 12; // oder n Monate

        for(int monat = 0; monat <= monate; monat++) {
            gesamtpopulation = (erwachsene + kinder + babies)*2;
            // Nach 1 Monat, Kinder erwachsen
            erwachsene = erwachsene + kinder;
            kinder = babies;
            babies = erwachsene*6;
            System.out.println("Anzahl der Ratten nach " + monat +".Monat ist: "+gesamtpopulation);
        }
    }
}
