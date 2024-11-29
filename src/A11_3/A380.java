package A11_3;

public class A380 extends Passagierflugzeug{
    // Klassenvariable
    static int anzahl;
    // A380 ist ein Passagierflugzeug, das 79,8 m Spannweite hat, 558 Sitzplätze und 4 Motoren mit jeweils 320 kN
    public A380() {
        super(79.8, 558, 4*320.0);
        ++anzahl;
    }
    public static int getAnzahl() {
        return anzahl;
    }

    @Override
    public String toString() {
        return super.toString() + " (A380)";
    }
}
