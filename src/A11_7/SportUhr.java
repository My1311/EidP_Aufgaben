package A11_7;

public class SportUhr extends Uhr{
    String anzeige = "";
    int herzfrequenz = 0;
    int wechsel = 0;

    public SportUhr() {
        super.toString();
        anzeige = "Uhrzeit: " + zeit;
    }
    public void setHerzfrequenz(int wert) {
        herzfrequenz = wert;
        if(wechsel == 1) {
            anzeige = "Herzfrequenz: " + herzfrequenz;
        }
    }
    public void wechselAnzeige() {
        if(wechsel == 0) {
            anzeige = "Herzfrequenz: " + herzfrequenz;
            wechsel = 1;
        } else {
            anzeige = "Uhrzeit: " + zeit;
            wechsel = 0;
        }
    }
    public void tick() {
        super.tick();
        if(wechsel == 0) {
            anzeige = "Uhrzeit: " + zeit;
        }
    }
    public String toString() {
        super.toString();
        return anzeige;
    }
}
