package A11_4;

public class Fussballspieler extends Person{
    int einkommen;
    public Fussballspieler(String nachname, int einkommen){
        super(nachname);
        this.einkommen = einkommen;
    }
    public int getEinkommen(){
        return einkommen;
    }
    public String toString(){
        return nachname + " " + einkommen;
    }
}
