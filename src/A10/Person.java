package A10;

public class Person {
    String vorname;
    int alter;
    public Person(String vorname, int alter) {
        this.vorname = vorname;
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public String toString() {
        return vorname + " (" + alter + ")";
    }
    public static void main(String[] args) {
        Person paul = new Person("Paul", 16);
        System.out.println(paul);
    }
}
