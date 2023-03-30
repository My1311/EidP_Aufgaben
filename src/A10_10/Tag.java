package A10_10;

public class Tag {
    // In diesem einfachen Kalender ist maximal ein Termin pro Tag zulässig
    private String verabredung = null;
    private int prioritaet = 0;
    // Es gibt keinen Termin fuer den Tag
    public Tag(){};
    public Tag(String was, int prioritaet) {
        this.verabredung = was;
        this.prioritaet = prioritaet;
    }
    public void eintragen(String was, int prioritaet) {
        verabredung = was;
        prioritaet = prioritaet;
    }
    public String getVerabredung(){
        return this.verabredung;
    }
    public int getPrioritaet(){
        return this.prioritaet;
    }



}
