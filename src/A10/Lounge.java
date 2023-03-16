package A10;

import java.util.HashMap;

public class Lounge {
    // Man  installisiert die gk mit new
    Getraenkekarte gk = new Getraenkekarte(); // gk == karte
    Person [] gaeste = new Person[0];
    public Lounge(){
        // wie in Aufgabestellung , Standardgetraenkekarte hat cola, bier, vodka
        gk.neuesGetraenk(new Getraenke("Cola", 200, 250, 0));
        gk.neuesGetraenk(new Getraenke("Bier", 200, 200, 16));
        gk.neuesGetraenk( new Getraenke("Vodka", 20, 300, 18));
    };
    // wenn wir die Karte bei Installiezieren erweitern
    public Lounge(Getraenkekarte gk){
        this.gk = gk;
    }

    public void bestellen(Person person, String name) {
        // überprüfen , ob das Getränk auf der Karte steht
        Getraenke gesuchtesGetraenk = gk.suchen(name);
        if (gesuchtesGetraenk != null ) {
            // ob die Person alt genug für dieses Getränk ist
            if(person.getAlter() >= gesuchtesGetraenk.freigabeAlter) {
                System.out.println("Bitte schoen, ihr Getrank!");

            } else {
                System.out.println("Du bist nicht alt genug fuer das Getraenk!");
            }
        } else {
            System.out.println("Ihr Getraenk ist nicht auf der Karte!");
        }
    }

    public static void main(String[] args) {
        // erzeuge Lounge mit Standardgetraenkekarte
        Lounge lounge = new Lounge();
        // erzeuge eine Person
        Person paul = new Person("Paul", 16);
        // Paul laesst sich die Karte zeigen
        // Karte auf dem Bildschirm anzeigen lassen
        System.out.println("Unsere Karte:\n" + lounge.gk);

        // Paul bestellt
        lounge.bestellen(paul,"Vodka");
        lounge.bestellen(paul,"Bier");
    }
}
