package A6;

public class SummeVersionNM {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        if(n>m){
            System.out.println("Fehler, m muss groesser als n sein.");
        }else {
            // for-Schleife
            int summe1 = 0;
            for (int i = n; i <=m ; i++) {
                summe1 = summe1 +1 ;
            }
            System.out.println(summe1);

            // while-Schleife
            int summe2 = 0;
            int i = n;// hier sollte 1 anderen Variable benutzen, sodass n bleibt unverandert.
            while (i<=m){
                summe2 = summe2 + i;
                i++;
            }
            System.out.println(summe2);

            //do while-Schleife
            int summe3 = 0;
            int j = n;
            do {
                summe3 = summe3 + j;
                j++;
            }while (j <= m);
            System.out.println(summe3);
        }
    }
}
