package A8;

public class MatrixTransponieren {
    public static void transponieren(double [][] a) {
        // Diagonale ist Symmetrieachse, eine Haelfte von Matrix mit anderer Haelfte tauschen
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                double tmp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = tmp;
            }
        }
    }
    public static void zeigeMatrix(double [][]a) {
        for (int i = 0; i <a.length ; i++) {
            for(int j = 0; j < a[0].length; j++){
                System.out.println(" " + a[i][j]);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
       double[][] a = { {1,2,3} , {4,5,6} ,{7,8,9}};

        System.out.println("vorher:");
        zeigeMatrix(a);
        transponieren(a);
        System.out.println("nacher:");
        zeigeMatrix(a);
    }
}
