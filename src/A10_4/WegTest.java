package A10_4;

public class WegTest {
    public static void main(String[] args) {
        Punkt x1 = new Punkt(1, 1);
        Punkt x2 = new Punkt(2, 2);
        Weg w1 = new Weg(x1, 1);
        System.out.println(w1);
        Weg w2 = new Weg(x2, 1);
        System.out.println(w2);
        w1.verlaengern(w2);
        System.out.println(w1);
    }
    }
