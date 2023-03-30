package A11_2;

public class Stack {
    private int maximalGroesse;
    private int belegt = -1;// Lokation, wo Objekt hinzugefurt ist
    private Object array[];
    public Stack(int maximalGroesse) {
        this.maximalGroesse = maximalGroesse;
        array = new Object[maximalGroesse];
    }
    public void push(Object o){
        if(!isEmpty() ) {
            System.out.println("Der Stack ist full!");
        }
        else {
            System.out.println("Einfuegen:" +o);
            array[++belegt] = o;
        }
    };
    // liefert das oberste Stack-Element und
    //löscht es auch gleichzeitig vom Stack
    public Object pop() {
        if(belegt < 0){
            System.out.println("Es gibt keinen Object in Stack!");
        }
        return array[belegt--];

    };
    // ob der Stack noch Platz hat
    public boolean isEmpty() {
        if(belegt > maximalGroesse){
            return false;
        }
        return true;
    };

    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push("a");
        st.push("b");
        st.push("c");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }

}
