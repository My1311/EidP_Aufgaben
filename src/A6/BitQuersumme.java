package A6;

public class BitQuersumme {
    public static void main(String[] args) {
        int zahl = Integer.parseInt(args[0]);
        int summe = 0;
        while (zahl > 0)  {
            summe += zahl%2;
            zahl = (int) zahl/2;
        }
        System.out.println(summe);
    }
}
