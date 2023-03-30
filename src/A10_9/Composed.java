package A10_9;

public class Composed extends Function{
    private Function f, g;
    public Composed(Function f, Function g){
        this.f = f;
        this.g = g;
    }
    public double map(double x) {
        return g.map(f.map(x));
    }
}
