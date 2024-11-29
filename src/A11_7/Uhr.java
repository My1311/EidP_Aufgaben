package A11_7;

public class Uhr {
    int stunde;
    int minute;
    int sekunde;

    String zeit = "";
    public Uhr(){}

    public Uhr(int stunde, int minute, int sekunde) {
        this.stunde = stunde;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    public void tick() {
        sekunde++;
        if (sekunde == 60) {
            minute++;
            sekunde = 0;
        }
        if (minute == 60) {
            stunde++;
            minute = 0;
        }
        if (stunde == 24) {
            stunde = 0;
        }
        toString(); // ohne diese Method wird die Zeit nicht aktualisiert (siehe Test.java, Uhrzeit: 0:0:0 blebt, obwohl die aktuelle Zeit 0:0:1 ist (nach tick())).
        // der Wert ist veraendert, aber nicht gezeigt

    }
    public String toString() {
        return zeit = stunde + ":" + minute + ":" + sekunde;
    }
}
