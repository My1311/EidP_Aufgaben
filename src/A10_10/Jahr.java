package A10_10;

public class Jahr {
    private int jahreszahl;
    Tag [] tage = new Tag[366];
    private  int belegt = 0; // zeigt die Anzahl von Termin pro Tag, maximal ist ein Termin pro Tag hier zulässig
    // einen Konstruktor, der eine Jahresangabe annimmt (z.B. 2021) und einen leeren Kalender mit 365
    //(leeren) Tag-Objekten zu diesem Jahr erzeugt.
    public Jahr(int jahreszahl) {
      this.jahreszahl = jahreszahl;
      for (int i = 1; i < 366; i++) {
            tage[i] = new Tag();
        }
    }
    public void eintragen(int tag, String was, int prioritaet){
        if (tage[tag].getVerabredung() == null) {
            tage[tag].eintragen(was, prioritaet);
            belegt ++;
        }
        else{
            System.out.println("Fehler:" + tage[tag].getVerabredung());
        }
    }
    public String getTermin(int tag) {
        return tage[tag].getVerabredung();
    }
    public int getPrioritaet(int tag) {
        return tage[tag].getPrioritaet();
    }
    public int getBelegt(){
        return belegt;
    }
}
