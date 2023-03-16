package A10_3;

public class Rational {
    int zaehler;
    int nenner;
    public Rational(int zaehler, int nenner){
        int teiler = ggT(zaehler,nenner);
        this.zaehler = zaehler/teiler;
        this.nenner = nenner/teiler;
        if( nenner < 0) {
            this.zaehler = zaehler * (-1);
            this.nenner = nenner * (-1);
        }
        if(nenner == 0) {
            System.out.println("Fehler: Nenner ist 0");
        }
    }
    public Rational(int zaehler) {
        this.zaehler = zaehler;
        this.nenner = 1;
    }
    public int ggT(int a, int b) {
       if(a == 0)
           return b;
       return ggT(b%a, a);
    }
    public String toString() {
        return zaehler + "/" + nenner;
    }
    public int kgV(int x, int y) {
        int result=0;
        for(int i = 1; i <= y; i++) {
            if(i*x % y == 0){
                result =(i*x);
                break;
            }
        }
        return result;
    }
    private Rational bruchOptimeren(Rational x){
        int teiler = ggT(x.zaehler,x.nenner);
        x.zaehler = x.zaehler/teiler;
        x.nenner = x.nenner/teiler;
        if( x.nenner < 0) {
            x.zaehler = x.zaehler * (-1);
            x.nenner = x.nenner * (-1);
        }
        if(x.nenner == 0) {
            System.out.println("Fehler: Nenner ist 0");
        }
        return x;
    }
    public Rational add (Rational x ){
        // mit einer anderen Rational addieren
        Rational result = new Rational(0,1);
        int kgVNenner = kgV(this.nenner, x.nenner);
        result.nenner = kgVNenner;
        result.zaehler = this.zaehler *(kgVNenner/this.nenner) + x.zaehler*(kgVNenner/x.nenner);
        // den Bruch optimieren
        return bruchOptimeren(result);
    }

    public Rational sub(Rational x) {
        Rational result = new Rational(0,1);
        int kgVNenner = kgV(this.nenner, x.nenner);
        result.nenner = kgVNenner;
        result.zaehler = this.zaehler *(kgVNenner/this.nenner) - x.zaehler*(kgVNenner/x.nenner);
        // den Bruch optimieren
        return bruchOptimeren(result);
    }

    public Rational mul(Rational y) {
        Rational result = new Rational(0,1);
        result.zaehler = this.zaehler * y.zaehler;
        result.nenner = this.nenner * y.nenner;
        return bruchOptimeren(result);
    }

    public Rational div(Rational y) {
        Rational result = new Rational(0,1);
        result.zaehler = this.zaehler * y.nenner;
        result.nenner = this.nenner * y.zaehler;
        return bruchOptimeren(result);
    }
    

    public static void main(String[] args) {
        Rational a = new Rational(1,3);
        Rational b = new Rational(3,4);
        Rational c = a.add(b); // wenn a.add(b) und S.o.p(a) haben wir 1/3 als Ergebnis
        System.out.println(c);
        Rational d = a.sub(b);
        Rational e = a.mul(b);
        Rational f = a.div(b);
        System.out.println(d+ " " + e + " " +  f );

    }
}
