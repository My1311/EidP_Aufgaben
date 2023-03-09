package A8;

public class Aufgabe2_ArrayBasics {
    public static int methodeA (int [] array, int wert){
        int anzahl = 0; // Anzahl der Wert in Array
        for (int i = 0; i <array.length ; i++) {
            if (array[i] == wert) {
                anzahl ++;
            }
        }
        return anzahl;
    }
    // Array umkehren
    public static int [] methodeB (int []array) {
        int [] umgekehrteArray = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            umgekehrteArray[i] = array[array.length-1-i];

        }
        return umgekehrteArray;
    }
    // Array umkehren, aber mit 
    public static int [] methodeC (int []array) {
        for (int i = 0; i < array.length/2 ; i++) {
            int tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;

        }
        return array;
    }

    public static void main(String[] args) {
        int [] a = {3,5,6,3,7,3,6,9,1,2,3,5,1,6};
        System.out.println(methodeA(a,3) + "-mal ist " +3 + " im Feld enthalten.");
        int[] b = methodeB(a);
        methodeC(a);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i] +"");
            if (a[i] != b[i]) {
                System.out.println("Fehler: Die Felder sind verschieden!");
            }
        }
        System.out.println("");
    }
}
