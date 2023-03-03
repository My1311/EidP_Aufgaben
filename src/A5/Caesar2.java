package A5;


import java.util.Scanner;
public class Caesar2 {
    public static void main (String [] args) {
        // Daten einlesen
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();

        // Jede Buchstabe in string s nehmen
        for(int i=0; i <s.length(); i++) {
            char c = s.charAt(i);

            // verschluesseln
            int code = c - 'A';
            code = (code + k) % 26;
            char ergebnis = (char) (code + 'A');
            System.out.println("Buchstabe " + c + " verschlusselt " + ergebnis);
        }
    }
}
