package A10_9;

public class Parabel extends Function{
    private double a,b, c;
    public Parabel(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double map(double x) {
        return a*x*x + b*x + c;
    }
}
