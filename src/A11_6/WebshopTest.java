package A11_6;

public class WebshopTest {
    public static void main(String[] args) {
        WebShop w = new WebShop();

        Kunde k1 = w.neuerKunde("Helga","Herrlich");
        Kunde k2 = w.neuerKunde("Werner","Winzig", 0.05);

        w.neuerArtikel("Leberwurst", 1.95, 2);
        w.neuerArtikel("Nutella", 3.95, 1);

        String [] bestellung1 ={"Leberwurst","Nutella"};
        String rechnung1 = w.bestellen(k1, bestellung1);
        System.out.println(rechnung1);

        String [] bestellung2 ={"Leberwurst","Nutella", "Butter"};
        String rechnung2 = w.bestellen(k2, bestellung1);
        System.out.println(rechnung2);

    }
}
