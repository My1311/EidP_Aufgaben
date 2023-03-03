package A5;
import java.util.*;
public class Zeichenzaehler {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();


        int anzahlGross = 0; // Anzahl der Grossbuchstaben in string s
        int anzahlKlein = 0; // Anzahl der Kleinbuchstaben in string s
        int anzahlZiffern = 0; // Anzahl der Ziffern in string s

        for(int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            if (c>= 'A' && c <='Z') {
                anzahlGross++;
            }
            if (c>= 'a' && c <='z') {
                anzahlKlein++;
            }
            if (c>= '0' && c <='9') {
                anzahlZiffern++;
            }
        }
        System.out.println(s);
        System.out.println("Anzahl der Grossbuchstaben:" +anzahlGross);
        System.out.println("Anzahl der Kleinbuchstaben:" +anzahlKlein);
        System.out.println("Anzahl der Ziffern:" +anzahlZiffern);
    }
}
