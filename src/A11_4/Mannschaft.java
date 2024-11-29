package A11_4;

public class Mannschaft {
    Fussballspieler[] mannschaft = new Fussballspieler[5];
    int einkommen;
    String team = "";
    public  Mannschaft(Fussballspieler[] mannschaft){
        this.mannschaft = mannschaft;

    }

    public Mannschaft(Fussballspieler s1, Fussballspieler s2, Fussballspieler s3, Fussballspieler s4, Fussballspieler s5) {
        mannschaft[0] = s1;
        mannschaft[1] = s2;
        mannschaft[2] = s3;
        mannschaft[3] = s4;
        mannschaft[4] = s5;
    }

    public int einkommen() {
        for (int i = 0; i < mannschaft.length; i++) {
            einkommen += mannschaft[i].getEinkommen();
        }
        return einkommen;
    }

    public String toString() {
        for (int i = 0; i < mannschaft.length; i++) {
            team += (i + 1) + ". " + mannschaft[i].nachname + "\n";
        }
        return team;
    }
}