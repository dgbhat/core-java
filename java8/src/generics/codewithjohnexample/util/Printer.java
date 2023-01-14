package generics.codewithjohnexample.util;

public class Printer {
    private Integer value;

    public Printer(Integer value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }
}
