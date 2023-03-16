package A10;

import java.util.Arrays;

public class Getraenkekarte {
    // Instanzvariable
    Getraenke [] getraenkList = new Getraenke[0];

    public Getraenkekarte() {
    }

    public void neuesGetraenk(Getraenke g){

        Getraenke[] neu = Arrays.copyOf(getraenkList, getraenkList.length+1);
        /*
        // Feld anlegen, das eins laenger ist
        Getraenke[] neu = new Getraenke[this.getraenkList.length + 1];
        // alte Ergbnisse kopieren
        for (int i = 0; i < getraenkList.length; i++) {
            neu[i]=getraenkList[i];
        }*/
        // neues Ergebnis hinzufuegen
        neu[getraenkList.length] = g;
        // alte Ergebnisliste ersetzen
        getraenkList = neu;
    }
    public String toString (){
        /*String ret = "";
        for (Getraenke g:
             this.getraenkList) {
            ret += g.toString() + "\n";
        }
        return ret;*/
        return Arrays.toString(this.getraenkList);
    }
    public Getraenke suchen (String name) {
        for (int i = 0; i <getraenkList.length ; i++) {
            if (name.equals(getraenkList[i].name) ) {
                return getraenkList[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // leere Karte erzeugen
        Getraenkekarte gk = new Getraenkekarte();
        // Getranke erzeugen
        gk.neuesGetraenk(new Getraenke("Cola", 200, 250, 0));
        gk.neuesGetraenk(new Getraenke("Bier", 200, 200, 16));
        gk.neuesGetraenk( new Getraenke("Vodka", 20, 300, 18));
        // Karte auf dem Bildschirm anzeigen lassen
        System.out.println(gk);
        // Getraenke suchen
        Getraenke g = gk.suchen("Cola");
        if(g != null) {
            System.out.println(g);
        }
    }
}
