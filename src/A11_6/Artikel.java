package A11_6;

public class Artikel {
    String name;
    double preis;
    int bestand; //wie viele Exemplare derzeit vorhanden sind
    public Artikel(String name, double preis, int bestand) {
        this.name = name;
        this.preis = preis;
        this.bestand = bestand;
    }
    public String toString() {
        return name + " : " +preis;
    }
}
