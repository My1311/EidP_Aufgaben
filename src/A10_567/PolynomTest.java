package A10_567;

public class PolynomTest {
    public static void main(String[] args) {

    // Aufgabe 5
    double [] wert = {3,2,1};
    Polynom p = new Polynom(wert);
    System.out.println("Polynom q ist:" +p);
    System.out.println(p.auswerten(2));
    System.out.println((p.getAnzahl()));

    // Aufgabe 6
    double [] wert2 = {1,2,3,4};
    Polynom q = new Polynom(wert2);
    System.out.println("Polynom q ist:" +q);
    Polynom r = p.addieren(q);
    System.out.println("Polynom r ist:" +r);
    Polynom r1 = r.ableiten();
    Polynom r2 = r1.ableiten();
    System.out.println("Polynom r' ist:" +r1);
    System.out.println("Polynom r'' ist:" +r2);

    // Aufgabe 7
    Polynom r3 = r1.integrieren();
    System.out.println("Polynom r1 ist integiert: "+r3);
    Polynom s = r1.multiplizieren(r3);
    System.out.println("Polynom s ist:"+s);
    }
}
