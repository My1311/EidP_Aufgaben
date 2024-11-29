package A11_4;

public class Stadion {
    public static void main(String[] args) {
        Fussballspieler [] roteSpieler = new Fussballspieler[5];
        Fussballspieler [] blaueSpieler = new Fussballspieler[5];

        Person[] p = new Person[45000];
        for (int i = 0; i < 45000; i++) {
            p[i] = new Person("Zuschauer-" + (i+1));
        }
        for (int i = 0; i < 5; i++) {
            roteSpieler[i] = new Fussballspieler("Spieler-rot-" + (i+1), (10000 *(i+1)));
            blaueSpieler[i] = new Fussballspieler("Spieler-blau-" + (i+1), (20000 *(i+1)));
        }

        Mannschaft rot = new Mannschaft(roteSpieler);
        Mannschaft blau = new Mannschaft(blaueSpieler);

        System.out.println(rot);
        System.out.println(blau);
        System.out.println();
        System.out.println(rot.einkommen());
        System.out.println(blau.einkommen());
        System.out.println(p[0]);
    }
}
