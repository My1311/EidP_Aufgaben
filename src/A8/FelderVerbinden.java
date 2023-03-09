package A8;

public class FelderVerbinden {
    public static int [] zusammenfuegen (int [] x, int [] y){
        int [] result = new int [x.length + y.length];
        // x-Teil kopieren
        for (int i = 0; i < x.length; i++) {
            result[i] = x[i];
        }
        // danach y-Teil kopieren
        for (int i =0; i < y.length; i++) {
            result[x.length+i] = y[i];

        }
        return  result;

    }
    public static void main(String[] args) {
        int [] x = {1,2,3};
        int [] y ={4,5,6};
        int [] z = zusammenfuegen(x,y);
        for (int i = 0; i <z.length ; i++) {
            System.out.println(z[i] + "");
        }
        System.out.println();
    }
}
