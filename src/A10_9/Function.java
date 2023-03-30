package A10_9;

public class Function {
    // Identitätsfunktion
    public double map(double x) {
        return x;
    }
    // Funktionsverlauf: eine derartige Wertetabelle erstellen
    public void print(double klein, double gross, double schritt){
        for (double x = klein; x <= gross ; x+= schritt) {
            System.out.println("f(" + x + ")=" + map(x));

        }
    }
}
