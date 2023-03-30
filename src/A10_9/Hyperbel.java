package A10_9;

public class Hyperbel extends Function{
    private double a;
    public Hyperbel(double a) {
        this.a = a;
    }
    public double map(double x) {
        return a / x;
    }
}
