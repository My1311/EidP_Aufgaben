package A11_6;

public class WebShop {
    Kunde [] k = new Kunde[10];
    Artikel [] a = new Artikel[10];

    int a_Zaehler;
    int k_Zaehler = -1;
    public WebShop(){};

    // Artikel hinzufuegen
    public void neuerArtikel(String name, double preis, int anzahl){
        // anzahl: die Anzahl an Exemplaren ist, die vorhanden sein soll
        a[a_Zaehler] = new Artikel(name,preis,anzahl);
        a_Zaehler++;
    }
    public Kunde neuerKunde(String vorname, String nachname) {
        k_Zaehler++;
        k[k_Zaehler] = new Kunde(vorname, nachname);
        return k[k_Zaehler];
    }
    // Kunde hinzufuegen
    public Kunde neuerKunde(String vorname, String nachname, double nachlass) {
        k_Zaehler ++;
        k[k_Zaehler] = new GuterKunde(vorname, nachname, nachlass);
        return k[k_Zaehler];
    }
    // Kunden bestellen Artikel
    public String bestellen(Kunde kunde, String[] artikel) {
        String warenkorb;
        int artikelZaehler = 0;
        boolean verfuegbar = false;
        double gesamtPreis = 0;
       // We must downcasting(Kunde -> GuterKunde), otherwise we will have a compilation error (Guterkunde gk = new Kunde();)
        // Hier Downcasting with instanceof
        // Wir berechnen die Rechnung fur guter Kunde
        if(kunde instanceof GuterKunde){
            GuterKunde gk = (GuterKunde) kunde;
            warenkorb = "Rechnung fuer unseren guten Kunden " + gk.toString()+", Preisnachlass " + (gk.getRabatt() * 100)+ "%:\n";
            // Wir machen 1 Schleife, um alle Artikel durchzugehen
            for (int i = 0; i < artikel.length; i++) {
                // Wir suchen die gewuschte Artikel in Schleife
                while(a[artikelZaehler] != null){
                    if (artikel[i]== a[artikelZaehler].name) {
                        // Wenn die Anzahl nicht null ist
                        if (a[artikelZaehler].bestand != 0) {
                            warenkorb += a[artikelZaehler].name + " : " + ((1 - gk.getRabatt()) * a[artikelZaehler].preis) + "\n";
                            gesamtPreis += (1 - gk.getRabatt()) * a[artikelZaehler].preis;
                            a[artikelZaehler].bestand--;
                        }
                        verfuegbar = true;
                    }
                    // Wenn wir haben die gewuschte Artikel nicht mehr
                    else {
                        warenkorb += a[artikelZaehler].name + " : ist leider nicht mehr vorhanden!\n";
                    }
                    artikelZaehler++;
                }
                if(verfuegbar == false){
                    warenkorb += artikel[i] +" : nicht gefunden\n";
                }
                verfuegbar = false;
                artikelZaehler = 0;
            }
        }
        // // Wir berechnen die Rechnung fur normale Kunde
        else {
            warenkorb = "Rechnung fuer " + kunde.toString()+ "\n";
            // Wir machen 1 Schleife, um alle Artikel durchzugehen
            for (int i = 0; i < artikel.length; i++) {
                // Wir suchen die gewuschte Artikel in Schleife
                while (a[artikelZaehler] != null) {
                    if(artikel[i] == a[artikelZaehler].name) {
                        // Wenn die Anzahl nicht null ist
                        if (a[artikelZaehler].bestand != 0) {
                            warenkorb += a[artikelZaehler].name + " : " + a[artikelZaehler].preis + "\n";
                            gesamtPreis += a[artikelZaehler].preis;
                            a[artikelZaehler].bestand--;
                        }
                        verfuegbar = true;
                    }
                    // Wenn wir haben die gewuschte Artikel nicht mehr
                    else {
                        warenkorb += a[artikelZaehler].name + " : ist leider nicht mehr vorhanden!\n";

                    }
                    artikelZaehler++;
                }
                if (verfuegbar == false) {
                    warenkorb += artikel[i] + " : nicht gefunden\n";
                }
                verfuegbar = false;
                artikelZaehler = 0;
            }
        }
            return warenkorb +"Gesamtpreis : "+gesamtPreis+ "\n";
    }
}
