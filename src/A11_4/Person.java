package A11_4;

public class Person {
    String nachname;
    public Person(String nachname){
        this.nachname = nachname;
    }
    public String getNachname(){
        return nachname;
    }

    public String toString() {
        return nachname;
    }
}
