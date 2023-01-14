package generics.codewithjohnexample;

public class GenericPrinter<T> {
    private T value;

    public GenericPrinter(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }
}
