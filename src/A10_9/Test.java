package A10_9;

public class Test {
    public static void main(String[] args) {
        // Test 1
        Function f = new Parabel(1.0, -2.0, 2);
        f.print(-1.0, 1.0, 0.1);
        // Test 2
        Function g = new Hyperbel(1.0);
        Function h = new Composed(f,g);
        h.print(-1.0, 1.0, 0.1);

    }
}
