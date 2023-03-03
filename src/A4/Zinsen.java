package A4;

public class Zinsen {
    public static void main (String [] args) {
        double K0 = Double.parseDouble(args [0]);
        double p = Double.parseDouble(args [1]);
        double n = Double.parseDouble(args [2]);
        double m = Double.parseDouble(args [3]);

        double Kn, Kn1, Kn2, i;
        // Einfache Verzinsung
        Kn = K0*(1+n*p/100);
        // Zinseszins:
        Kn1 = K0* Math.pow((1+p/100), n);
        // Unterjahrige Verzinsung
        Kn2 = K0* Math.pow((1+p/(100*m)), m*n);
        System.out.println(Kn);
        System.out.println(Kn1);
        System.out.println(Kn2);

    }
}
