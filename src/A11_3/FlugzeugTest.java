package A11_3;

public class FlugzeugTest {
    public static void main(String[] args) {
        // ein Segelflugzeug mit 17m Spannweite erzeugen
        Segelflugzeug sf = new Segelflugzeug(17.0);
        System.out.println(sf);

        // ein Passagierflugzeug mit 10,97 Spannweite, 4 Plaetzen und 1,3kN Schub
        Passagierflugzeug pg = new Passagierflugzeug(10.97, 4, 1.3);
        System.out.println(pg);

        // eine A380 erzeugen (Jede A380 sieht gleich aus.)
        A380 a380 = new A380();
        System.out.println(a380);

        // Anzahl Flugzeuge jeder Kategorie ausgeben
        System.out.println("Anzahl Flugzeuge: "+ Flugzeug.getAnzahl());
        System.out.println("Anzahl Segelflugzeuge: "+ Segelflugzeug.getAnzahl());
        System.out.println("Anzahl Passagierflugzeuge: "+ Passagierflugzeug.getAnzahl());
        System.out.println("Anzahl A380: "+ A380.getAnzahl());
    }


}
