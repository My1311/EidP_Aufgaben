package A10_567;

public class Polynom {
    // Niederwertiester Koeffizient steht in koeffizienten[0]
    private double [] koeffzienten ;

    private static int anzahl; // die Anzahl der bis dahin erzeugten Polynome liefert
    // Polynom erzeugen
    public  Polynom (double [] k) {
        // fehlerhaftes Argument
        if((k == null) || (k.length == 0)) {
            System.out.println("Fehler: Polynom ohne Koeffizienten ist schlecht");
        }
        else {
            // Wir kopieren Polynom, sodass this Polynon  wird nicht verandert.
            this.koeffzienten = k.clone();
        }
        // fuehrende Nullen entfernen
        normalisieren();
       // wir haben ein Polynom mehr
        anzahl++;
    }
    // normalisiert ein Polynom (hoechster Koeffizient ungleich 0)
    private void normalisieren() {
        double epsilon = 1e-15;
        int grad = koeffzienten.length;
        boolean weglassen = true;

        // fuehrende Nullen bei hohen Koeffizienten weglassen
        for (int i = grad-1; i >=0 ; i--) {
            if(Math.abs(koeffzienten[i]) < epsilon) {
                if(weglassen) {
                    grad--;
                } else {
                    weglassen = false;
                }
            }else {
                weglassen = false;
            }
        }
        // neues Koeffizientenfeld anlegen
        double[] neueKoeffizienten = new double[grad];
        for (int i = 0; i <grad ; i++) {
            neueKoeffizienten[i] = koeffzienten[i];
        }
        // dies sind jetzt unsere Koeffizienten
        koeffzienten = neueKoeffizienten;
    }
    public static int getAnzahl() {
        return anzahl;
    }
    public int getGrad() {
        return koeffzienten.length;
    }
    public double getKoeffizientent(int i) {
        if( i < koeffzienten.length) {
            return koeffzienten[i];
        }
        else {
            System.out.println("Fehler: Koeffizient existiert nicht.");
            return 0.0;
        }
    }

    public String toString() {
        String ausgabe = "";
        for (int i = koeffzienten.length -1; i >= 0; i--) {
            ausgabe += koeffzienten[i] + "*x^" + i + " ";
        }
        return ausgabe;
    }
    public double auswerten(double x){
        double sum = 0.0;
        // Hornerschema
        for (int i = koeffzienten.length -1 ; i >= 0; i--) {
            sum  = (sum * x) + koeffzienten[i];
        }
        return sum;
    }
    public Polynom addieren( Polynom q) {
        // bestimmen Ergebnisgrad
        int gradThis = this.getGrad();
        int gradQ = q.getGrad();
        int ergebnisGrad = gradThis;
        if(gradQ > ergebnisGrad) {
            ergebnisGrad = gradQ;
        }

        // bestime Ergebniskoeffizienten
        double[] neueKoeffizienten = new double[ergebnisGrad];
        for (int i = 0; i <ergebnisGrad ; i++) {
            neueKoeffizienten[i] = 0;
            if(gradThis > i) {
                neueKoeffizienten[i] += this.getKoeffizientent(i);
            }
            if(gradQ > i) {
                neueKoeffizienten[i] += q.getKoeffizientent(i);
            }

        }
        // erzeuge Ergebnispolynom
        return new Polynom(neueKoeffizienten);
    }
    public Polynom multiplizieren(Polynom q){
        // bestimmen Ergebnisgrad
        int gradThis = this.getGrad();
        int gradQ = q.getGrad();
        int ergebnisGrad = gradThis + gradQ;
        // bestimme Ergebniskoeffizienten
        double[] neueKoeffizienten = new double[ergebnisGrad];
        for (int i = 0; i <this.getGrad() ; i++) {
            for (int j = 0; j <q.getGrad() ; j++) {
                neueKoeffizienten[i+j] += this.getKoeffizientent(i) * q.getKoeffizientent(j);
            }
        }
        return new Polynom(neueKoeffizienten);
    }
    public Polynom ableiten(){
       if((koeffzienten == null) || (koeffzienten.length <=1)) {
           System.out.println("Ableitung macht keinen Sinn.");
           return null;
       } else {
           double [] neueKoeffizienten = new double[koeffzienten.length-1];
           for (int i = 0; i < koeffzienten.length-1; i++) {
               neueKoeffizienten[i] = (i+1) * koeffzienten[i+1];
           }
           return new Polynom(neueKoeffizienten);
       }
    }

    public Polynom integrieren(){
        double[] neueKoeffizienten = new double[koeffzienten.length + 1];
        neueKoeffizienten[0] = 0;
        for (int i = 0; i <koeffzienten.length ; i++) {
            neueKoeffizienten[i+1] = koeffzienten[i] / (i+1);
        }
        return new Polynom(neueKoeffizienten);
    }
}
