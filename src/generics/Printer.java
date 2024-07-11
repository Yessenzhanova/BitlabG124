package generics;

public class Printer <T> {
    private T t;

    public Printer() {
    }

    public Printer(T t) {
        this.t = t;
    }

    public T getValue() {
        return t;
    }

    public void setValue(T t) {
        this.t = t;
    }

    void printValue(){
        System.out.println("Value is " + t);
    }
    void refresh(){
        t = null;
    }
}
