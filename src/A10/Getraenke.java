package A10;

public class Getraenke {
    String name;
    int abgabeMenge;
    int preis;
    int freigabeAlter; // ab dem 1 Gast dieses Getraenke bestellen kann

    public Getraenke(String name, int menge, int preis, int alter) {
        this.name = name;
        this.abgabeMenge = menge;
        this.preis = preis;
        this.freigabeAlter = alter;
    }
    public String toString() {
        return "Name: " +name + ", Menge: " + abgabeMenge + ", Preis: " +preis  + ", Altersfreigabe: " + freigabeAlter;
    }

    public static void main(String[] args) {
        // Getranke erzeugen
        Getraenke cola = new Getraenke("Cola", 200, 250, 0);
        Getraenke bier = new Getraenke("Bier", 200, 200, 16);
        Getraenke vodka = new Getraenke("Vodka", 20, 300, 18);
        System.out.println(cola);
    }
}
