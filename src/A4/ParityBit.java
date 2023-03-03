package A4;

public class ParityBit {
    public static void main(String[] args) {
        int wert = 0x17;
        int parity = (wert & 0x1);
        int summe;

        wert = wert >> 1;

        summe = wert & 0x1;
        wert = wert >> 1;

        summe += wert & 0x1;
        wert = wert >> 1;

        summe += wert & 0x1;
        wert = wert >> 1;

        summe += wert & 0x1;
        wert = wert >> 1;

        System.out.println((summe % 2) == parity);

        System.out.println(summe);

        System.out.println(parity);
    }
}
