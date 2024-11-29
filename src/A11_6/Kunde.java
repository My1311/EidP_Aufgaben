package A11_6;

public class Kunde {
    private String vorname;
    private String nachname;
    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }
    public String getVorname (){
        return vorname;
    }
    public String getNachname (){
        return nachname;
    }
    public String toString() {
        return  vorname + " " + nachname;
    }
}
