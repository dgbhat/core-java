package generics.codewithjohnexample.util;

public class GenericPrinter<T> {
    private T thing;

    public GenericPrinter(T thing) {
        this.thing = thing;
    }

    public void print() {
        System.out.println(thing);
    }
}
