package A10_4;

public class Punkt {
    private int x;
    private int y;

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public String toString(){
        return "(" + x + "," + y+")";
    }
}
